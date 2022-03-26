package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.schedule.PersonnelRequirementProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelrequirementproperties")
@Controller
@RooWebScaffold(path = "personnelrequirementproperties", formBackingObject = PersonnelRequirementProperty.class)
public class PersonnelRequirementPropertyController {
}
