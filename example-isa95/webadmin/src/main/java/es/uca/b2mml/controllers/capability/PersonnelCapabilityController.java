package es.uca.b2mml.controllers.capability;
import java.util.Arrays;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.capability.PersonnelCapability;
import es.uca.b2mml.domain.capability.PersonnelCapabilityProperty;
import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelcapabilities")
@Controller
@RooWebScaffold(path = "personnelcapabilities", formBackingObject = PersonnelCapability.class)
public class PersonnelCapabilityController {
    void populateEditForm(Model uiModel, PersonnelCapability personnelCapability) {
        uiModel.addAttribute("personnelCapability", personnelCapability);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("capabilitytypes", Arrays.asList(CapabilityType.values()));
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("personnelcapabilitypropertys", PersonnelCapabilityProperty.findAllPersonnelCapabilityPropertys());
        uiModel.addAttribute("productioncapabilities", ProductionCapability.findAllProductionCapabilities());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("people", Person.findAllPeople());
        uiModel.addAttribute("personclasses", PersonClass.findAllPersonClasses());
    }
}
