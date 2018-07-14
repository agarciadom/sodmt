package es.uca.b2mml.controllers.people;
import es.uca.b2mml.domain.people.PersonClassProperty;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personclassproperties")
@Controller
@RooWebScaffold(path = "personclassproperties", formBackingObject = PersonClassProperty.class)
public class PersonClassPropertyController {
}
