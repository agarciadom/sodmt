package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.perform.PersonnelActualProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelactualproperties")
@Controller
@RooWebScaffold(path = "personnelactualproperties", formBackingObject = PersonnelActualProperty.class)
public class PersonnelActualPropertyController {
}
