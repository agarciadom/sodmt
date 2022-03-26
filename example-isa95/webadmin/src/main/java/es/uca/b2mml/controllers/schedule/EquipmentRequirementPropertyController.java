package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.schedule.EquipmentRequirementProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentrequirementproperties")
@Controller
@RooWebScaffold(path = "equipmentrequirementproperties", formBackingObject = EquipmentRequirementProperty.class)
public class EquipmentRequirementPropertyController {
}
