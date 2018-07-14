package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.Equipment;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipments")
@Controller
@RooWebScaffold(path = "equipments", formBackingObject = Equipment.class)
public class EquipmentController {
}
