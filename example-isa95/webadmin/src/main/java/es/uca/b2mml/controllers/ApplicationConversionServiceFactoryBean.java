package es.uca.b2mml.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.roo.addon.web.mvc.controller.converter.RooConversionService;
import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialClassProperty;
import es.uca.b2mml.domain.material.MaterialDefinitionProperty;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialLotProperty;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.material.QATestSpec;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.product.ProductProductionRule;
import es.uca.b2mml.domain.product.ProductSegment;
import es.uca.b2mml.domain.product.ProductSegmentDependency;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.psegment.ProcessSegmentDependency;

/**
 * A central place to register application converters and formatters.
 */
@RooConversionService
public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {

    @SuppressWarnings("deprecation")
    @Override
    protected void installFormatters(FormatterRegistry registry) {
        super.installFormatters(registry);

        registry.addConverter(getQuantityWithUnitToStringConverter());
    }

	private Converter<QuantityWithUnit, String> getQuantityWithUnitToStringConverter() {
		return new Converter<QuantityWithUnit, String>() {
			@Override
			public String convert(QuantityWithUnit source) {
				return String.format("%s %s",
					source.getQuantityValue().toPlainString(),
					source.getQuantityUnit() != null ? source.getQuantityUnit().getName() : "");
			}
        };
	}

    public Converter<Person, String> getPersonToStringConverter() {
        return new Converter<es.uca.b2mml.domain.people.Person, java.lang.String>() {
            public String convert(Person person) {
            	if (person.getSurnames() != null && person.getSurnames().trim().length() > 0) {
            		return String.format("%s, %s (%s)", person.getSurnames(), person.getName(), person.getNationalID());
            	}
            	else {
            		return String.format("%s (%s)", person.getName(), person.getNationalID());
            	}
            }
        };
    }

    public Converter<MaterialClass, String> getMaterialClassToStringConverter() {
        return new Converter<es.uca.b2mml.domain.material.MaterialClass, java.lang.String>() {
            public String convert(MaterialClass materialClass) {
                return materialClass.getClassId();
            }
        };
    }

    public Converter<MaterialLotProperty, String> getMaterialLotPropertyToStringConverter() {
        return new Converter<es.uca.b2mml.domain.material.MaterialLotProperty, java.lang.String>() {
            public String convert(MaterialLotProperty materialLotProperty) {
                return String.format("%s (%s)", materialLotProperty.getName(), materialLotProperty.getLot().getLotId());
            }
        };
    }

    public Converter<MaterialClassProperty, String> getMaterialClassPropertyToStringConverter() {
        return new Converter<es.uca.b2mml.domain.material.MaterialClassProperty, java.lang.String>() {
            public String convert(MaterialClassProperty materialClassProperty) {
                return String.format("%s (%s)", materialClassProperty.getName(), materialClassProperty.getMaterialClass().getClassId());
            }
        };
    }

    public Converter<MaterialDefinitionProperty, String> getMaterialDefinitionPropertyToStringConverter() {
        return new Converter<es.uca.b2mml.domain.material.MaterialDefinitionProperty, java.lang.String>() {
            public String convert(MaterialDefinitionProperty materialDefinitionProperty) {
                return String.format("%s (%s)", materialDefinitionProperty.getName(), materialDefinitionProperty.getDefinition().getDefinitionId());
            }
        };
    }

    public Converter<QATestSpec, String> getQATestSpecToStringConverter() {
        return new Converter<es.uca.b2mml.domain.material.QATestSpec, java.lang.String>() {
            public String convert(QATestSpec qaTestSpec) {
                return qaTestSpec.getName();
            }
        };
    }

    public Converter<ProductionCapability, String> getProductionCapabilityToStringConverter() {
        return new Converter<es.uca.b2mml.domain.capability.ProductionCapability, java.lang.String>() {
            public String convert(ProductionCapability productionCapability) {
                final StringBuffer sbuf = new StringBuffer(productionCapability.getCapabilityId());
                final Calendar start = productionCapability.getStartTime();
                final Calendar end = productionCapability.getEndTime();
                if (start != null && end != null) {
                    final SimpleDateFormat format = new SimpleDateFormat();
                    sbuf.append(" (from ");
                    sbuf.append(format.format(start.getTime()));
                    sbuf.append(" to ");
                    sbuf.append(format.format(end.getTime()));
                    sbuf.append(")");
                }
                return sbuf.toString();
            }
        };
    }

    public Converter<EquipmentClass, String> getEquipmentClassToStringConverter() {
        return new Converter<es.uca.b2mml.domain.equip.EquipmentClass, java.lang.String>() {
            public String convert(EquipmentClass equipmentClass) {
                return equipmentClass.getName();
            }
        };
    }

	public Converter<MaterialLot, String> getMaterialLotToStringConverter() {
        return new Converter<es.uca.b2mml.domain.material.MaterialLot, java.lang.String>() {
            public String convert(MaterialLot materialLot) {
                return materialLot.getLotId();
            }
        };
    }

	public Converter<MaterialSublot, String> getMaterialSublotToStringConverter() {
        return new Converter<es.uca.b2mml.domain.material.MaterialSublot, java.lang.String>() {
            public String convert(MaterialSublot materialSublot) {
                return materialSublot.getSublotId();
            }
        };
    }

	public Converter<Unit, String> getUnitToStringConverter() {
        return new Converter<es.uca.b2mml.domain.Unit, java.lang.String>() {
            public String convert(Unit unit) {
                return unit.getName();
            }
        };
    }

	public Converter<Equipment, String> getEquipmentToStringConverter() {
        return new Converter<es.uca.b2mml.domain.equip.Equipment, java.lang.String>() {
            public String convert(Equipment equipment) {
                return equipment.getEquipmentId();
            }
        };
    }

	public Converter<ProcessSegment, String> getProcessSegmentToStringConverter() {
        return new Converter<es.uca.b2mml.domain.psegment.ProcessSegment, java.lang.String>() {
            public String convert(ProcessSegment processSegment) {
                return processSegment.getSegmentId();
            }
        };
    }

	public Converter<ProductProductionRule, String> getProductProductionRuleToStringConverter() {
        return new Converter<es.uca.b2mml.domain.product.ProductProductionRule, java.lang.String>() {
            public String convert(ProductProductionRule productProductionRule) {
                return productProductionRule.getRuleId();
            }
        };
    }

	public Converter<ProductSegment, String> getProductSegmentToStringConverter() {
        return new Converter<es.uca.b2mml.domain.product.ProductSegment, java.lang.String>() {
            public String convert(ProductSegment productSegment) {
                return productSegment.getSegmentId();
            }
        };
    }

	public Converter<ProcessSegmentDependency, String> getProcessSegmentDependencyToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<es.uca.b2mml.domain.psegment.ProcessSegmentDependency, java.lang.String>() {
            public String convert(ProcessSegmentDependency processSegmentDependency) {
                return String.format("%s -> %s (%s)",
                	processSegmentDependency.getSegmentA().getSegmentId(),
                	processSegmentDependency.getSegmentB().getSegmentId(),
                	processSegmentDependency.getDependencyType());
            }
        };
    }

	public Converter<ProductSegmentDependency, String> getProductSegmentDependencyToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<es.uca.b2mml.domain.product.ProductSegmentDependency, java.lang.String>() {
            public String convert(ProductSegmentDependency productSegmentDependency) {
                return String.format("%s -> %s (%s)",
                    	productSegmentDependency.getSegmentA().getSegmentId(),
                    	productSegmentDependency.getSegmentB().getSegmentId(),
                    	productSegmentDependency.getDependencyType());
            }
        };
    }
}
