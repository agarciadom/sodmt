package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.EquipmentProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentproperties")
@Controller
@RooWebScaffold(path = "equipmentproperties", formBackingObject = EquipmentProperty.class)
public class EquipmentPropertyController {
}
