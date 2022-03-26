package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.schedule.MaterialRequirementProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialrequirementproperties")
@Controller
@RooWebScaffold(path = "materialrequirementproperties", formBackingObject = MaterialRequirementProperty.class)
public class MaterialRequirementPropertyController {
}
