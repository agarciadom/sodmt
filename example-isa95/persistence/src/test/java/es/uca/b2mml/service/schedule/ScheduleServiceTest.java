package es.uca.b2mml.service.schedule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import es.uca.b2mml.domain.capability.EquipmentCapability;
import es.uca.b2mml.domain.capability.PersonnelCapability;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;
import es.uca.b2mml.domain.schedule.ProductionRequest;
import es.uca.b2mml.domain.schedule.ProductionSchedule;
import es.uca.b2mml.domain.schedule.SegmentRequirement;

/**
 * Tests for the {@link ScheduleService} class.
 *
 * @author antonio
 */
@ContextConfiguration("/testContext-with-duplicates.xml")
public class ScheduleServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

	private static final Calendar DEFAULT_START_DATE = new DateTime(2013, 11, 1, 0, 0, 0, 0).toCalendar(Locale.ENGLISH);

        @Autowired
        private ScheduleService scheduleService;

        @Before
        public void setUp() {
                if (System.getenv("GITHUB_ACTION") != null) {
                        // This is *only* needed in Github Actions: for some reason, add-duplicates.sql
                        // will not be run automatically by hbm2ddl.import_files.
                        try {
                                executeSqlScript("add-duplicates.sql", false);
                        } catch (Exception ex) {
                                // Nothing to do
                        }
                }
        }

        @Test
        public void listEarliestAvailableEquipmentByClass() throws Exception {
                final EquipmentClass eqClass = EquipmentClass.findByName("EQC-RectifyingLines");
                final Calendar earliest = Calendar.getInstance();
                earliest.setTime(new SimpleDateFormat("yyyy/MM/dd").parse("2013/10/01"));

                final List<EquipmentCapability> results = EquipmentCapability.findEarliestAvailableOf(eqClass, null, earliest);
                assertTrue(results.size() > 0);
                for (EquipmentCapability cap : results) {
                        assertTrue(cap.getEquipment().getClasses().contains(eqClass));
                        assertTrue(cap.getStartTime().after(earliest));
                }
        }

        @Test
        public void listEarliestAvailableIndividualEquipment() throws Exception {
                final Equipment equipment = Equipment.findByEquipmentId("EQ-Rectifying Line #2");
                final Calendar earliest = Calendar.getInstance();
                earliest.setTime(new SimpleDateFormat("yyyy/MM/dd").parse("2013/10/01"));

                final List<EquipmentCapability> results = EquipmentCapability.findEarliestAvailable(equipment, earliest);
                assertTrue("There should be one or more available pieces of equipment", results.size() > 0);
                for (EquipmentCapability cap : results) {
                        assertSame("The equipment should be the same object", equipment, cap.getEquipment());
                        assertTrue("The capability start time should be after the threshold", cap.getStartTime().after(earliest));
                }
        }

        @Test
        public void findStartTimeSet() throws Exception {
                List<EquipmentCapability> results = EquipmentCapability.findStartTimeSet();
                assertTrue(results.size() > 0);
        }

        @Test
        public void listAvailableEquipmentByRange() throws Exception {
                final Equipment equipment    = Equipment.findByEquipmentId("EQ-Rectifying Line #2");
                final DateTime dateTimeStart = new DateTime(2013, 11, 1, 0, 0, 0, 0);
                final DateTime dateTimeEnd   = dateTimeStart.plusDays(1).toDateMidnight().toDateTime();
                final Calendar rangeStart    = dateTimeStart.toCalendar(Locale.getDefault());
                final Calendar rangeEnd      = dateTimeEnd.toCalendar(Locale.getDefault());

                final List<EquipmentCapability> results
                        = EquipmentCapability.findByDateRangeAndEquipment(rangeStart, rangeEnd, equipment);
                assertEquals(
                        "There should be one result between " + dateTimeStart + " and " + dateTimeEnd,
                        1, results.size());
        }

        @Test
        public void listAvailableEquipmentByRangeAndClass() throws Exception {
                final EquipmentClass eqClass = EquipmentClass.findByName("EQC-RectifyingLines");
                final DateTime dateTimeStart = new DateTime(2013, 11, 1, 0, 0, 0, 0);
                final DateTime dateTimeEnd   = dateTimeStart.plusDays(1).toDateMidnight().toDateTime();
                final Calendar rangeStart    = dateTimeStart.toCalendar(Locale.ENGLISH);
                final Calendar rangeEnd      = dateTimeEnd.toCalendar(Locale.ENGLISH);

                final List<EquipmentCapability> results
                        = EquipmentCapability.findByDateRangeAndEquipmentClass(rangeStart, rangeEnd, null, eqClass);
                assertEquals(
                        "There should be two results between " + dateTimeStart + " and " + dateTimeEnd,
                        2, results.size());
        }

        @Test
        public void listAvailablePersonnelByRange() throws Exception {
                final Person person = Person.findByName("Operator 1");
                final DateTime dateTimeStart = new DateTime(2013, 11, 1, 0, 0, 0, 0);
                final DateTime dateTimeEnd   = dateTimeStart.plusDays(1).toDateMidnight().toDateTime();
                final Calendar rangeStart    = dateTimeStart.toCalendar(Locale.getDefault());
                final Calendar rangeEnd      = dateTimeEnd.toCalendar(Locale.getDefault());

                final List<PersonnelCapability> results = PersonnelCapability.findByDateRangeAndPerson(rangeStart, rangeEnd, person);
                assertEquals(1, results.size());
        }

        @Test
        public void listAvailablePersonnelByRangeAndClass() throws Exception {
                final PersonClass person = PersonClass.findByName("Operators");
                final DateTime dateTimeStart = new DateTime(2013, 11, 1, 0, 0, 0, 0);
                final DateTime dateTimeEnd   = dateTimeStart.plusDays(1).toDateMidnight().toDateTime();
                final Calendar rangeStart    = dateTimeStart.toCalendar(Locale.getDefault());
                final Calendar rangeEnd      = dateTimeEnd.toCalendar(Locale.getDefault());

                final List<PersonnelCapability> results = PersonnelCapability.findByDateRangeAndClass(rangeStart, rangeEnd, person);
                assertEquals(4, results.size());
        }

        @Test
        public void listAvailableMaterialSublots() throws Exception {
                final MaterialDefinition definition = MaterialDefinition.findByDefinitionId("SM-01-M");
                final List<MaterialSublot> results = MaterialSublot.findByDefinition(definition);
                assertEquals(1, results.size());
        }

        @Test
        public void doLargeFourSides() throws ScheduleException {
                final String reason = "Order 123";
                final ProductionSchedule schedule
                        = scheduleService.generateEarliestSchedule(reason, "PPR-RL4", new BigDecimal(100), "Pieces", DEFAULT_START_DATE);

                assertTrue(schedule.getScheduleId().startsWith("PS"));
                assertEquals(reason, schedule.getDescription());
                assertEquals(4, schedule.getRequests().size());

                final ProductionRequest request = schedule.getRequests().iterator().next();
                assertSortedSegmentNamesAreEqualTo(Arrays.asList(
                                "SG-R-Setup-LM",
                                "SG-R-Feeder-L",
                                "SG-R-HRectifying-L",
                                "SG-R-VRectifying-L",
                                "SG-R-Drying", "SG-R-Inspection", "SG-R-BoxLoading"
                        ), request);
                //System.out.println(schedule.toString());
        }

        @Test
        public void doLargeTwoSides() throws ScheduleException {
                final String reason = "Order 123";
                final ProductionSchedule schedule
                        = scheduleService.generateEarliestSchedule(reason, "PPR-RL2", new BigDecimal(100), "Pieces", DEFAULT_START_DATE);

                assertTrue(schedule.getScheduleId().startsWith("PS"));
                assertEquals(reason, schedule.getDescription());
                assertEquals(4, schedule.getRequests().size());

                final ProductionRequest request = schedule.getRequests().iterator().next();
                assertSortedSegmentNamesAreEqualTo(Arrays.asList(
                                "SG-R-Setup-LM",
                                "SG-R-Feeder-L",
                                "SG-R-HRectifying-L",
                                "SG-R-Drying", "SG-R-Inspection", "SG-R-BoxLoading"
                        ), request);

                //System.out.println(schedule.toString());
        }

        @Test
        public void doMediumFourSides() throws ScheduleException {
                final String reason = "Order 123";
                final ProductionSchedule schedule
                        = scheduleService.generateEarliestSchedule(reason, "PPR-RM4", new BigDecimal(100), "Pieces", DEFAULT_START_DATE);

                assertTrue(schedule.getScheduleId().startsWith("PS"));
                 assertEquals(reason, schedule.getDescription());
                assertEquals(4, schedule.getRequests().size());

                final ProductionRequest request = schedule.getRequests().iterator().next();
                assertSortedSegmentNamesAreEqualTo(Arrays.asList(
                                "SG-R-Setup-LM",
                                "SG-R-Feeder-M",
                                "SG-R-HRectifying-M",
                                "SG-R-VRectifying-M",
                                "SG-R-Drying", "SG-R-Inspection", "SG-R-BoxLoading"
                        ), request);

                //System.out.println(schedule.toString());
        }

        @Test
        public void doMediumTwoSides() throws ScheduleException {
                final String reason = "Order 123";
                final ProductionSchedule schedule
                        = scheduleService.generateEarliestSchedule(reason, "PPR-RM2", new BigDecimal(100), "Pieces", DEFAULT_START_DATE);

                assertTrue(schedule.getScheduleId().startsWith("PS"));
                assertEquals(reason, schedule.getDescription());
                assertEquals(4, schedule.getRequests().size());

                final ProductionRequest request = schedule.getRequests().iterator().next();
                assertSortedSegmentNamesAreEqualTo(Arrays.asList(
                                "SG-R-Setup-LM",
                                "SG-R-Feeder-M",
                                "SG-R-HRectifying-M",
                                "SG-R-Drying", "SG-R-Inspection", "SG-R-BoxLoading"
                        ), request);

                //System.out.println(schedule.toString());
        }

        @Test
        public void doCustomFourSides() throws ScheduleException {
                final String reason = "Order 123";
                final ProductionSchedule schedule
                        = scheduleService.generateEarliestSchedule(reason, "PPR-RC4", new BigDecimal(100), "Pieces", DEFAULT_START_DATE);

                assertTrue(schedule.getScheduleId().startsWith("PS"));
                assertEquals(reason, schedule.getDescription());
                assertEquals(4, schedule.getRequests().size());

                final ProductionRequest request = schedule.getRequests().iterator().next();
                assertSortedSegmentNamesAreEqualTo(Arrays.asList(
                                "SG-R-Setup-C",
                                "SG-R-Feeder-L",
                                "SG-R-Cutter",
                                "SG-R-HRectifying-C",
                                "SG-R-VRectifying-C",
                                "SG-R-Drying", "SG-R-Inspection", "SG-R-BoxLoading"
                        ), request);

                //System.out.println(schedule.toString());
        }

        @Test
        public void doCustomTwoSides() throws ScheduleException {
                final String reason = "Order 123";
                final ProductionSchedule schedule
                        = scheduleService.generateEarliestSchedule(reason, "PPR-RC2", new BigDecimal(100), "Pieces", DEFAULT_START_DATE);

                assertTrue(schedule.getScheduleId().startsWith("PS"));
                assertEquals(reason, schedule.getDescription());
                assertEquals(4, schedule.getRequests().size());

                final ProductionRequest request = schedule.getRequests().iterator().next();
                assertSortedSegmentNamesAreEqualTo(Arrays.asList(
                                "SG-R-Setup-C",
                                "SG-R-Feeder-L",
                                "SG-R-Cutter",
                                "SG-R-HRectifying-C",
                                "SG-R-Drying", "SG-R-Inspection", "SG-R-BoxLoading"
                        ), request);

                //System.out.println(schedule.toString());
        }

        private void assertSortedSegmentNamesAreEqualTo(
                        final List<String> expectedSortedSegmentNames,
                        final ProductionRequest request) {
                final List<String> sortedSegmentNames = new ArrayList<String>();
                for (SegmentRequirement segmentRequirement : request.getSegmentsSortedByStart()) {
                        sortedSegmentNames.add(segmentRequirement.getProcessSegment().getSegmentId());
                }
                assertEquals(
                        expectedSortedSegmentNames,
                        sortedSegmentNames);
        }
}
