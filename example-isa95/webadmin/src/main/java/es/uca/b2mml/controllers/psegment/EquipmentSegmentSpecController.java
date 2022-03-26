package es.uca.b2mml.controllers.psegment;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.psegment.EquipmentSegmentSpec;
import es.uca.b2mml.domain.psegment.EquipmentSegmentSpecProperty;
import es.uca.b2mml.domain.psegment.ProcessSegment;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentsegmentspecs")
@Controller
@RooWebScaffold(path = "equipmentsegmentspecs", formBackingObject = EquipmentSegmentSpec.class)
public class EquipmentSegmentSpecController {
    void populateEditForm(Model uiModel, EquipmentSegmentSpec equipmentSegmentSpec) {
        uiModel.addAttribute("equipmentSegmentSpec", equipmentSegmentSpec);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("equipmentclasses", EquipmentClass.findAllEquipmentClasses());
        uiModel.addAttribute("equipmentsegmentspecproperties", EquipmentSegmentSpecProperty.findAllEquipmentSegmentSpecProperties());
        uiModel.addAttribute("processsegments", ProcessSegment.findAllProcessSegments());
    }
}
