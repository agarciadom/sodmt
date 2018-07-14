package es.uca.b2mml.service.schedule.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.joda.time.DateTime;

import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.SystemUnitType;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.capability.Capability;
import es.uca.b2mml.domain.capability.ChildCapability;
import es.uca.b2mml.domain.capability.EquipmentCapability;
import es.uca.b2mml.domain.capability.PersonnelCapability;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;
import es.uca.b2mml.domain.product.EquipmentSpec;
import es.uca.b2mml.domain.product.PersonnelSpec;
import es.uca.b2mml.domain.product.ProductProductionRule;
import es.uca.b2mml.domain.product.ProductSegment;
import es.uca.b2mml.domain.psegment.EquipmentSegmentSpec;
import es.uca.b2mml.domain.psegment.MaterialSegmentSpec;
import es.uca.b2mml.domain.psegment.PersonnelSegmentSpec;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.schedule.EquipmentRequirement;
import es.uca.b2mml.domain.schedule.MaterialRequirement;
import es.uca.b2mml.domain.schedule.PersonnelRequirement;
import es.uca.b2mml.domain.schedule.ProductionRequest;
import es.uca.b2mml.domain.schedule.ProductionSchedule;
import es.uca.b2mml.domain.schedule.SegmentRequirement;
import es.uca.b2mml.service.schedule.ScheduleException;

/**
 * Throwaway eager scheduler for producing a single schedule for a single order.
 *
 * @author antonio
 */
class EagerScheduler {

	private static final Logger LOGGER = Logger.getLogger(EagerScheduler.class.getCanonicalName());
	private static final int FORWARD_RANGE_DAYS = 14;

	private Map<Capability, QuantityWithUnit> usedCaps = new HashMap<Capability, QuantityWithUnit>();
	private Map<MaterialSublot, QuantityWithUnit> usedStock = new HashMap<MaterialSublot, QuantityWithUnit>();
	private Map<Equipment, Calendar> availableFrom = new HashMap<Equipment, Calendar>();

	private final Unit secondsUnit;

	public EagerScheduler() {
		secondsUnit = Unit.findBySystemType(SystemUnitType.SECOND);
	}

	public void schedule(ProductionSchedule schedule, ProductProductionRule productProductionRule, QuantityWithUnit requestedQuantityWithUnit, Calendar startDate) throws ScheduleException {
		final Calendar startingTime = new DateTime(startDate).plusDays(1).toDateMidnight().toCalendar(Locale.getDefault());

		QuantityWithUnit remaining = requestedQuantityWithUnit;
		while (remaining.greaterThanZero()) {
			final ProductionRequest request = new ProductionRequest();
			request.setRequestId("PR-" + getHexUID());

			final Map<MaterialDefinition, QuantityWithUnit> previousProducts = new HashMap<MaterialDefinition, QuantityWithUnit>();
			for (ProductSegment segment : getRootSegments(productProductionRule)) {
				QuantityWithUnit qtyScheduled = scheduleParent(request, segment, null, startingTime, remaining, previousProducts);
				remaining = remaining.subtract(qtyScheduled);

				LOGGER.fine(String.format("Scheduled %s, %s left to go", qtyScheduled, remaining));
			}
			schedule.addRequest(request);
		}
	}

	private Set<ProductSegment> getRootSegments(ProductProductionRule productProductionRule) throws ScheduleException {
		final Set<ProductSegment> productSegments = productProductionRule.getSegments();
		final Set<ProductSegment> rootSegments = new HashSet<ProductSegment>();
		for (ProductSegment segment : productSegments) {
			if (segment.getParent() == null) {
				rootSegments.add(segment);
			}
		}
		if (rootSegments.size() > 1) {
			// TODO: remove this limitation
			throw new ScheduleException("The product production rule had more than 1 root product segment");
		}
		return rootSegments;
	}

	private QuantityWithUnit scheduleParent(ProductionRequest request, ProductSegment segment, Set<Equipment> acceptableParents, Calendar startingTime, QuantityWithUnit maxQty, Map<MaterialDefinition, QuantityWithUnit> previousProducts) throws ScheduleException {
		// FIXME: allow parallel assignments
		final List<ProductSegment> children = segment.getSortedChildren();
		if (LOGGER.isLoggable(Level.FINE)) {
			StringBuilder sBuilder = new StringBuilder("Children are:");
			for (ProductSegment child : children) {
				sBuilder.append("\n - ");
				sBuilder.append(child.getSegmentId());
			}
			LOGGER.fine(sBuilder.toString());
		} 

		for (int i = 1; i < FORWARD_RANGE_DAYS; i++) {
			final Calendar rangeStart = new DateTime(startingTime).toCalendar(Locale.getDefault());
			final Calendar rangeEnd = new DateTime(rangeStart).plusDays(i).toDateMidnight().toCalendar(Locale.getDefault());

			// Try the alternative process segments (if any)
			if (segment.getProcessSegment().isEmpty()) {
				QuantityWithUnit qtyScheduled = scheduleParentSegment(
						request, segment, children, null,
						rangeStart, rangeEnd, acceptableParents, maxQty,
						previousProducts);
				if (qtyScheduled != null) {
					return qtyScheduled;
				}
			} else {
				for (ProcessSegment processSegment : segment.getProcessSegment()) {
					QuantityWithUnit qtyScheduled = scheduleParentSegment(
							request, segment, children, processSegment,
							rangeStart, rangeEnd, acceptableParents, maxQty,
							previousProducts);
					if (qtyScheduled != null) {
						return qtyScheduled;
					}
				}
			}
		}

		throw new ScheduleException("Could not find a valid schedule in the following " + FORWARD_RANGE_DAYS + " days for " + segment);
	}

	private QuantityWithUnit scheduleParentSegment(ProductionRequest request, ProductSegment segment, List<ProductSegment> children, ProcessSegment processSegment, Calendar rangeStart, Calendar rangeEnd, Set<Equipment> acceptableParents, QuantityWithUnit maxQty, Map<MaterialDefinition, QuantityWithUnit> previousProducts) throws ScheduleException {
		// TODO: parent restrictions on personnel / material are not supported now
		final Set<EquipmentCapability> equipmentCaps = collectCapabilities(rangeStart, rangeEnd, acceptableParents, segment, processSegment);
		if (equipmentCaps == null) {
			// Could not find matching capability: skip to next day
			return null;
		}

		// Make sure we're not trying to use the same production line for two requests at the same time
		final Set<Equipment> parentEqs = getEquipments(equipmentCaps);
		for (Equipment equipment : parentEqs) {
			final Calendar availableFromDate = availableFrom.get(equipment);
			if (availableFromDate != null && availableFromDate.after(rangeStart)) {
				rangeStart = availableFromDate;
			}
		}
		if (rangeStart.after(rangeEnd)) {
			return null;
		}
		
		// Schedule all the concrete segments
		try {
			final List<SegmentRequirement> newSegmentRequirements = new ArrayList<SegmentRequirement>();
			Calendar lastCompletionDate = rangeStart;
			QuantityWithUnit lastQuantity = maxQty;
			for (ProductSegment child : children) {
				final Pair<SegmentRequirement, QuantityWithUnit> partialSchedule = scheduleLeaf(request, child, parentEqs, lastCompletionDate, lastQuantity, previousProducts);
				lastCompletionDate = partialSchedule.getLeft().getLatestEndTime();
				lastQuantity = partialSchedule.getRight();

				newSegmentRequirements.add(partialSchedule.getLeft());
			}

			for (SegmentRequirement segmentRequirement : newSegmentRequirements) {
				request.addSegmentRequirement(segmentRequirement);
			}
			for (Equipment equipment : parentEqs) {
				availableFrom.put(equipment, lastCompletionDate);
			}

			return lastQuantity;
		} catch (ScheduleException ex) {
			LOGGER.warning("Error while scheduling, trying next date: " + ex.getLocalizedMessage());
		}

		return null;
	}
	
	/**
	 * Schedules the specified segment. Returns the completion date and the quantity produced (<code>null</code> if not important).
	 * @param request 
	 * @param acceptableParents 
	 * @param previousProducts 
	 * @throws ScheduleException 
	 */
	private Pair<SegmentRequirement, QuantityWithUnit> scheduleLeaf(ProductionRequest request, ProductSegment segment, Set<Equipment> acceptableParents, Calendar startingTime, QuantityWithUnit maxQty, Map<MaterialDefinition, QuantityWithUnit> previousProducts) throws ScheduleException {
		LOGGER.fine("Scheduling product segment " + segment.getSegmentId() + " with earliest date " + new DateTime(startingTime));

		for (int i = 1; i < FORWARD_RANGE_DAYS; i++) {
			final Calendar rangeStart = new DateTime(startingTime).plusDays(i - 1).toCalendar(Locale.getDefault());
			final Calendar rangeEnd = new DateTime(rangeStart).plusDays(i).toDateMidnight().toCalendar(Locale.getDefault());

			// Try the available process segments
			for (ProcessSegment processSegment : segment.getProcessSegment()) {
				final SegmentRequirement segmentRequirement = new SegmentRequirement(request, segment, processSegment);
				segmentRequirement.setSegmentRequirementId("SR-" + getHexUID());

				// Stage 1. Find the capabilities with the highest capacities
				final Set<EquipmentCapability> equipmentCapabilities = collectCapabilities(rangeStart, rangeEnd, acceptableParents, segment, processSegment);
				if (equipmentCapabilities == null) {
					continue;
				}

				final Set<PersonnelCapability> personnelCapabilities = collectCapabilities(rangeStart, rangeEnd, segment, processSegment);
				if (personnelCapabilities == null) {
					continue;
				}

				// Stage 2. Collect required inputs and time (input/output)
				final Map<MaterialDefinition, QuantityWithUnit> inputDefinitions = new HashMap<MaterialDefinition, QuantityWithUnit>();
				final Map<MaterialDefinition, QuantityWithUnit> outputDefinitions = new HashMap<MaterialDefinition, QuantityWithUnit>();
				collectInputsOutputs(segment, inputDefinitions, outputDefinitions);

				// Stage 3. Check all requirements, creating first a copy of the currently used resources to roll back if something goes wrong
				final Map<Capability, QuantityWithUnit> oldUsedCaps = new HashMap<Capability, QuantityWithUnit>(usedCaps);
				final Map<MaterialSublot, QuantityWithUnit> oldUsedStock = new HashMap<MaterialSublot, QuantityWithUnit>(usedStock);
				final Map<MaterialDefinition, QuantityWithUnit> oldPreviousProducts = new HashMap<MaterialDefinition, QuantityWithUnit>(previousProducts);
				
				try {
					// Stage 3a. Check if we have enough input stock
					inputs:
					for (final Iterator<MaterialDefinition> itDef = inputDefinitions.keySet().iterator(); itDef.hasNext();) {
						final MaterialDefinition definition = itDef.next();
						final QuantityWithUnit requiredQuantity = inputDefinitions.get(definition);

						final QuantityWithUnit previousQuantity = previousProducts .get(definition);
						if (previousQuantity != null && previousQuantity.compareTo(requiredQuantity) >= 0) {
							previousProducts.put(definition, previousQuantity.subtract(requiredQuantity));
						} else {
							for (MaterialSublot sublot : MaterialSublot.findByDefinition(definition)) {
								QuantityWithUnit availableStock = sublot.getQuantity();
								final QuantityWithUnit alreadyUsed = usedStock.get(sublot);
								if (alreadyUsed != null) {
									availableStock = availableStock.subtract(alreadyUsed);
								}

								if (availableStock.compareTo(requiredQuantity) >= 0) {
									usedStock.put(sublot, alreadyUsed == null ? requiredQuantity : alreadyUsed.add(requiredQuantity));
									addMaterialRequirement(segmentRequirement, definition, sublot, requiredQuantity);
									continue inputs;
								}
							}

							throw new ScheduleException(String.format(
									"Could not find %s of %s",
									requiredQuantity,
									definition.getDefinitionId()));
						}
					}

					// Stage 3b. Check if we have enough output capabilities
					for (MaterialDefinition definition : outputDefinitions.keySet()) {
						final QuantityWithUnit outputQuantity = outputDefinitions.get(definition);
						checkEquipmentCapabilities(segmentRequirement, equipmentCapabilities, outputQuantity);
						checkPersonnelCapabilities(segmentRequirement, personnelCapabilities, outputQuantity);
					}

					// Stage 3c. Check if we have enough time
					final QuantityWithUnit requiredTime = computeTotalTime(processSegment, outputDefinitions, previousProducts);
					checkEquipmentCapabilities(segmentRequirement, equipmentCapabilities, requiredTime);
					checkPersonnelCapabilities(segmentRequirement, personnelCapabilities, requiredTime);

					// Note down the remaining capabilities with no quantity
					for (EquipmentCapability capability : equipmentCapabilities) {
						final EquipmentRequirement requirement = new EquipmentRequirement();
						requirement.setSegmentRequirement(segmentRequirement);
						requirement.getEquipment().add(capability.getEquipment());
						segmentRequirement.getEquipmentRequirements().add(requirement);
					}
					for (PersonnelCapability capability : personnelCapabilities) {
						final PersonnelRequirement requirement = new PersonnelRequirement();
						requirement.setSegmentRequirement(segmentRequirement);
						requirement.getPeople().add(capability.getPerson());
						segmentRequirement.getPersonnelRequirements().add(requirement);
					}

					// Stage 4. Add approximate dates to the segment request
					segmentRequirement.setEarliestStartTime(rangeStart);

					final int requiredSeconds = requiredTime.convertTo(secondsUnit).getQuantityValue().intValue();
					final Calendar segmentEnd = new DateTime(rangeStart).plusSeconds(requiredSeconds).toCalendar(Locale.getDefault());
					segmentRequirement.setLatestEndTime(segmentEnd);
					previousProducts.putAll(outputDefinitions);

					final QuantityWithUnit qtyProduced = outputDefinitions.isEmpty() ? maxQty : sum(outputDefinitions.values());
					return new ImmutablePair<SegmentRequirement, QuantityWithUnit>(segmentRequirement, qtyProduced);
				} catch (ScheduleException ex) {
					LOGGER.warning("Error while scheduling, trying next date: " + ex.getLocalizedMessage());

					usedCaps = oldUsedCaps;
					usedStock = oldUsedStock;
					previousProducts.clear();
					previousProducts.putAll(oldPreviousProducts);
				}
			}
		}
		
		throw new ScheduleException("Could not find a valid schedule in the following " + FORWARD_RANGE_DAYS + " days for " + segment);
	}

	private void checkPersonnelCapabilities(
			final SegmentRequirement segmentRequirement,
			final Set<PersonnelCapability> personnelCapabilities,
			final QuantityWithUnit outputQuantity) throws ScheduleException {
		Iterator<PersonnelCapability> itCapabilities = personnelCapabilities.iterator();
		while (itCapabilities.hasNext()) {
			final PersonnelCapability capability = itCapabilities.next();
			if (capability.getQuantityUnit().isCompatibleWith(outputQuantity.getQuantityUnit())) {
				final QuantityWithUnit alreadyUsed = usedCaps.get(capability);
				final QuantityWithUnit totalRequired = alreadyUsed == null ? outputQuantity : outputQuantity.add(alreadyUsed);

				final QuantityWithUnit available = capability.getQuantity();
				if (available.compareTo(totalRequired) >= 0) {
					usedCaps.put(capability, totalRequired);

					final PersonnelRequirement requirement = new PersonnelRequirement();
					requirement.setSegmentRequirement(segmentRequirement);
					requirement.getPeople().add(capability.getPerson());
					requirement.setQuantity(outputQuantity);
					segmentRequirement.getPersonnelRequirements().add(requirement);

					itCapabilities.remove();
				}
				else {
					throw new ScheduleException(String.format("Could not find capability with %s: capability already had %s used out of %s", totalRequired, alreadyUsed, available));
				}
			}
		}
	}

	private void checkEquipmentCapabilities(
			final SegmentRequirement segmentRequirement,
			final Set<EquipmentCapability> equipmentCapabilities,
			final QuantityWithUnit outputQuantity) throws ScheduleException {
		Iterator<EquipmentCapability> itCapabilities = equipmentCapabilities.iterator();
		while (itCapabilities.hasNext()) {
			final EquipmentCapability capability = itCapabilities.next();
			if (capability.getQuantityUnit().isCompatibleWith(outputQuantity.getQuantityUnit())) {
				final QuantityWithUnit alreadyUsed = usedCaps.get(capability);
				final QuantityWithUnit totalRequired = alreadyUsed == null ? outputQuantity : outputQuantity.add(alreadyUsed);

				final QuantityWithUnit available = capability.getQuantity();
				if (available.compareTo(totalRequired) >= 0) {
					usedCaps.put(capability, totalRequired);

					final EquipmentRequirement requirement = new EquipmentRequirement();
					requirement.setSegmentRequirement(segmentRequirement);
					requirement.getEquipment().add(capability.getEquipment());
					requirement.setQuantity(outputQuantity);
					segmentRequirement.getEquipmentRequirements().add(requirement);

					itCapabilities.remove();
				}
				else {
					throw new ScheduleException(String.format("Could not find capability with %s: capability already had %s used out of %s", totalRequired, alreadyUsed, available));
				}
			}
		}
	}

	private void addMaterialRequirement(
			final SegmentRequirement segmentRequirement,
			final MaterialDefinition definition, MaterialSublot sublot,
			final QuantityWithUnit requiredQuantity) {
		final MaterialRequirement mRequirement = new MaterialRequirement();
		mRequirement.setSegmentRequirement(segmentRequirement);
		mRequirement.setConsumed(true);
		mRequirement.getMaterialDefinitions().add(definition);
		mRequirement.getMaterialLots().add(sublot.getLot());
		mRequirement.getMaterialSublots().add(sublot);
		mRequirement.setQuantity(requiredQuantity);
		segmentRequirement.getMaterialRequirements().add(mRequirement);
	}

	private QuantityWithUnit sum(Collection<QuantityWithUnit> values) {
		QuantityWithUnit sum = null;
		for (QuantityWithUnit value : values) {
			sum = sum == null ? value : sum.add(value);
		}
		return sum;
	}

	private QuantityWithUnit computeTotalTime(ProcessSegment processSegment,
			final Map<MaterialDefinition, QuantityWithUnit> outputDefinitions,
			final Map<MaterialDefinition, QuantityWithUnit> previousProducts) {
		QuantityWithUnit requiredTime;
		if (processSegment.getDurationUnit().getFractionUnit() == null) {
			// Fixed time
			requiredTime = processSegment.getDuration();
		}
		else {
			// Depending on the number of pieces
			final QuantityWithUnit timePerOutputElement = processSegment.getDuration();

			requiredTime = new QuantityWithUnit(0, secondsUnit);
			final Collection<QuantityWithUnit> quantities =
				outputDefinitions.isEmpty()
					? previousProducts.values()
					: outputDefinitions.values();
			for (QuantityWithUnit quantity : quantities) {
				requiredTime = requiredTime.add(quantity.multiply(timePerOutputElement));
			}
		}
		return requiredTime;
	}

	private void collectInputsOutputs(ProductSegment segment,
			final Map<MaterialDefinition, QuantityWithUnit> inputDefinitions,
			final Map<MaterialDefinition, QuantityWithUnit> outputDefinitions) {
		for (ProcessSegment processSegment : segment.getProcessSegment()) {
			
			for (MaterialSegmentSpec spec : processSegment.getMaterialSpecs()) {
				if (spec.getMaterialClass() != null) {
					LOGGER.warning("Material classes are ignored for now - FIX");
				}
				if (spec.getMaterialDefinition() != null) {
					switch (spec.getMaterialUse()) {
					case CONSUMED: inputDefinitions.put(spec.getMaterialDefinition(), spec.getQuantity()); break;
					case PRODUCED: outputDefinitions.put(spec.getMaterialDefinition(), spec.getQuantity()); break;
					default: LOGGER.warning("Consumables are ignored for now - FIX"); break;
					}
				}
			}
		}
	}

	private Set<PersonnelCapability> collectCapabilities(Calendar rangeStart, Calendar rangeEnd, ProductSegment segment, ProcessSegment processSegment) {
		final Set<PersonnelCapability> capabilities = new HashSet<PersonnelCapability>();
		for (PersonnelSpec equipmentSpec : segment.getPersonnel()) {
			for (Person person : equipmentSpec.getPeople()) {
				final PersonnelCapability capability = findCapability(rangeStart, rangeEnd, person);
				if (capability == null) {
					return null;
				} else {
					capabilities.add(capability);
				}
			}
			for (PersonClass personClass : equipmentSpec.getPersonnelClass()) {
				final PersonnelCapability capability = findCapability(rangeStart, rangeEnd, personClass);
				if (capability == null) {
					return null;
				} else {
					capabilities.add(capability);
				}
			}
		}

		if (processSegment != null) {
			for (PersonnelSegmentSpec spec : processSegment.getPersonnelSpecs()) {
				if (spec.getPerson() != null) {
					final PersonnelCapability capability = findCapability(rangeStart, rangeEnd, spec.getPerson());
					if (capability == null) {
						return null;
					} else {
						capabilities.add(capability);
					}
				}
				if (spec.getPersonClass() != null) {
					final PersonnelCapability capability = findCapability(rangeStart, rangeEnd, spec.getPersonClass());
					if (capability == null) {
						return null;
					} else {
						capabilities.add(capability);
					}
				}
			}
		}

		return capabilities;
	}

	private Set<EquipmentCapability> collectCapabilities(Calendar rangeStart, Calendar rangeEnd, Set<Equipment> acceptableParents, ProductSegment productSegment, ProcessSegment processSegment) {
		final Set<EquipmentCapability> capabilities = new HashSet<EquipmentCapability>();
		for (EquipmentSpec equipmentSpec : productSegment.getEquipment()) {
			for (Equipment equipment : equipmentSpec.getEquipment()) {
				final EquipmentCapability capability = findCapability(rangeStart, rangeEnd, equipment);
				if (capability == null) {
					return null;
				} else {
					capabilities.add(capability);
				}
			}
			for (EquipmentClass equipmentClass : equipmentSpec.getEquipmentClasses()) {
				final EquipmentCapability capability = findCapability(rangeStart, rangeEnd, acceptableParents, equipmentClass);
				if (capability == null) {
					return null;
				} else {
					capabilities.add(capability);
				}
			}
		}

		if (processSegment != null) {
			for (EquipmentSegmentSpec spec : processSegment.getEquipmentSpecs()) {
				if (spec.getEquipment() != null) {
					final EquipmentCapability capability = findCapability(rangeStart, rangeEnd, spec.getEquipment());
					if (capability == null) {
						return null;
					} else {
						capabilities.add(capability);
					}
				}
				if (spec.getEquipmentClass() != null) {
					final EquipmentCapability capability = findCapability(rangeStart, rangeEnd, acceptableParents, spec.getEquipmentClass());
					if (capability == null) {
						return null;
					} else {
						capabilities.add(capability);
					}
				}
			}
		}

		if (acceptableParents != null) {
			// Use capabilities from the selected acceptable parents as well
			final Set<Equipment> parentEquipments = new HashSet<Equipment>();
			for (EquipmentCapability capability : capabilities) {
				// We assume here that all the collected capabilities are for individual equipments
				assert capability.getEquipment() != null;

				final Equipment parent = capability.getEquipment().getParent();
				if (parent != null) {
					parentEquipments.add(parent);
				}
			}
			parentEquipments.retainAll(acceptableParents);

			for (Equipment parent : parentEquipments) {
				final EquipmentCapability capability = findCapability(rangeStart, rangeEnd, parent);
				if (capability == null) {
					return null;
				} else {
					capabilities.add(capability);
				}
			}
		}

		return capabilities;
	}

	private PersonnelCapability findCapability(Calendar rangeStart, Calendar rangeEnd, PersonClass personClass) {
		final List<PersonnelCapability> capabilities = PersonnelCapability.findByDateRangeAndClass(rangeStart, rangeEnd, personClass);
		return findMaxCapability(capabilities);
	}

	private PersonnelCapability findCapability(Calendar rangeStart, Calendar rangeEnd, Person person) {
		final List<PersonnelCapability> capabilities = PersonnelCapability.findByDateRangeAndPerson(rangeStart, rangeEnd, person);
		return findMaxCapability(capabilities);
	}

	private EquipmentCapability findCapability(Calendar rangeStart, Calendar rangeEnd, Equipment equipment) {
		final List<EquipmentCapability> capabilityList = EquipmentCapability.findByDateRangeAndEquipment(rangeStart, rangeEnd, equipment);
		return findMaxCapability(removeEquipmentInUse(capabilityList));
	}

	private EquipmentCapability findCapability(Calendar rangeStart, Calendar rangeEnd, Set<Equipment> acceptableParents, EquipmentClass equipmentClass) {
		final List<EquipmentCapability> capabilityList = EquipmentCapability.findByDateRangeAndEquipmentClass(rangeStart, rangeEnd, acceptableParents, equipmentClass);
		return findMaxCapability(removeEquipmentInUse(capabilityList));
	}

	private List<EquipmentCapability> removeEquipmentInUse(List<EquipmentCapability> capabilities) {
		for (Iterator<EquipmentCapability> itCapability = capabilities.iterator(); itCapability.hasNext(); ) {
			final EquipmentCapability capability = itCapability.next();
			final Equipment equipment = capability.getEquipment();
			final Calendar equipmentAvailableFrom = availableFrom.get(equipment);
			if (equipmentAvailableFrom != null && equipmentAvailableFrom.after(capability.getStartTime())) {
				itCapability.remove();
			}
		}
		return capabilities;
	}

	private <T extends ChildCapability> T findMaxCapability(final List<T> capabilityList) {
		T maxCapability = null;
		QuantityWithUnit maxRemaining = null;

		for (T capability : capabilityList) {
			final QuantityWithUnit available = capability.getQuantity();
			final QuantityWithUnit used = usedCaps.get(capability);
			final QuantityWithUnit remaining = used == null ? available : available.subtract(used);

			if (remaining.greaterThanZero() && (maxRemaining == null || maxRemaining.compareTo(remaining) < 0)) {
				maxCapability = capability;
				maxRemaining = remaining;
			}
		}

		return maxCapability;
	}

	private Set<Equipment> getEquipments(final Set<EquipmentCapability> selectedEquipmentCaps) {
		final Set<Equipment> selectedEquipment = new HashSet<Equipment>();
		for (EquipmentCapability cap : selectedEquipmentCaps) {
			selectedEquipment.add(cap.getEquipment());
		}
		return selectedEquipment;
	}

	private String getHexUID() {
		return Long.toHexString(UUID.randomUUID().getMostSignificantBits());
	}

}