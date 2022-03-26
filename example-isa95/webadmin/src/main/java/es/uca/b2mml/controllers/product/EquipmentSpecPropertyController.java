package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.product.EquipmentSpecProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentspecproperties")
@Controller
@RooWebScaffold(path = "equipmentspecproperties", formBackingObject = EquipmentSpecProperty.class)
public class EquipmentSpecPropertyController {
}
