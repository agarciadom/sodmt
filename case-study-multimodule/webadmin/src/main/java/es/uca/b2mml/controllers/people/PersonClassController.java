package es.uca.b2mml.controllers.people;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.people.PersonClass;

@RequestMapping("/personclasses")
@Controller
@RooWebScaffold(path = "personclasses", formBackingObject = PersonClass.class)
public class PersonClassController {
}
