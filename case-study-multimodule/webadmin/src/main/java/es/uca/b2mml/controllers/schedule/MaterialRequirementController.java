package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.schedule.MaterialRequirement;
import es.uca.b2mml.domain.schedule.MaterialRequirementProperty;
import es.uca.b2mml.domain.schedule.SegmentRequirement;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialrequirements")
@Controller
@RooWebScaffold(path = "materialrequirements", formBackingObject = MaterialRequirement.class)
public class MaterialRequirementController {
    void populateEditForm(Model uiModel, MaterialRequirement materialRequirement) {
        uiModel.addAttribute("materialRequirement", materialRequirement);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("materialclasses", MaterialClass.findAllMaterialClasses());
        uiModel.addAttribute("materialdefinitions", MaterialDefinition.findAllMaterialDefinitions());
        uiModel.addAttribute("materiallots", MaterialLot.findAllMaterialLots());
        uiModel.addAttribute("materialsublots", MaterialSublot.findAllMaterialSublots());
        uiModel.addAttribute("materialrequirementproperties", MaterialRequirementProperty.findAllMaterialRequirementProperties());
        uiModel.addAttribute("segmentrequirements", SegmentRequirement.findAllSegmentRequirements());
    }
}
