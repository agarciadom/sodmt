package es.uca.b2mml.controllers.people;
import es.uca.b2mml.domain.people.QualificationTestSpec;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/qualificationtestspecs")
@Controller
@RooWebScaffold(path = "qualificationtestspecs", formBackingObject = QualificationTestSpec.class)
public class QualificationTestSpecController {
}
