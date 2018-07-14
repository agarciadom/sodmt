package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.schedule.EquipmentRequirement;
import es.uca.b2mml.domain.schedule.EquipmentRequirementProperty;
import es.uca.b2mml.domain.schedule.SegmentRequirement;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentrequirements")
@Controller
@RooWebScaffold(path = "equipmentrequirements", formBackingObject = EquipmentRequirement.class)
public class EquipmentRequirementController {
    void populateEditForm(Model uiModel, EquipmentRequirement equipmentRequirement) {
        uiModel.addAttribute("equipmentRequirement", equipmentRequirement);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("equipmentclasses", EquipmentClass.findAllEquipmentClasses());
        uiModel.addAttribute("equipmentrequirementproperties", EquipmentRequirementProperty.findAllEquipmentRequirementProperties());
        uiModel.addAttribute("segmentrequirements", SegmentRequirement.findAllSegmentRequirements());
    }
}
