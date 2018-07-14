package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.perform.EquipmentActualProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentactualproperties")
@Controller
@RooWebScaffold(path = "equipmentactualproperties", formBackingObject = EquipmentActualProperty.class)
public class EquipmentActualPropertyController {
}
