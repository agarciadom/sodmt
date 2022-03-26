package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.product.EquipmentSpec;
import es.uca.b2mml.domain.product.EquipmentSpecProperty;
import es.uca.b2mml.domain.product.ProductSegment;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentspecs")
@Controller
@RooWebScaffold(path = "equipmentspecs", formBackingObject = EquipmentSpec.class)
public class EquipmentSpecController {
    void populateEditForm(Model uiModel, EquipmentSpec equipmentSpec) {
        uiModel.addAttribute("equipmentSpec", equipmentSpec);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("equipmentclasses", EquipmentClass.findAllEquipmentClasses());
        uiModel.addAttribute("equipmentspecproperties", EquipmentSpecProperty.findAllEquipmentSpecProperties());
        uiModel.addAttribute("productsegments", ProductSegment.findAllProductSegments());
    }
}
