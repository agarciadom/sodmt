package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.perform.EquipmentActual;
import es.uca.b2mml.domain.perform.EquipmentActualProperty;
import es.uca.b2mml.domain.perform.SegmentResponse;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentactuals")
@Controller
@RooWebScaffold(path = "equipmentactuals", formBackingObject = EquipmentActual.class)
public class EquipmentActualController {
    void populateEditForm(Model uiModel, EquipmentActual equipmentActual) {
        uiModel.addAttribute("equipmentActual", equipmentActual);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("equipmentclasses", EquipmentClass.findAllEquipmentClasses());
        uiModel.addAttribute("equipmentactualproperties", EquipmentActualProperty.findAllEquipmentActualProperties());
        uiModel.addAttribute("segmentresponses", SegmentResponse.findAllSegmentResponses());
    }
}
