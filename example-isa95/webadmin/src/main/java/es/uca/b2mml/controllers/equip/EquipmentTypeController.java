package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.EquipmentType;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmenttypes")
@Controller
@RooWebScaffold(path = "equipmenttypes", formBackingObject = EquipmentType.class)
public class EquipmentTypeController {
}
