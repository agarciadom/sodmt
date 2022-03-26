package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.EquipmentClassProperty;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentclassproperties")
@Controller
@RooWebScaffold(path = "equipmentclassproperties", formBackingObject = EquipmentClassProperty.class)
public class EquipmentClassPropertyController {
}
