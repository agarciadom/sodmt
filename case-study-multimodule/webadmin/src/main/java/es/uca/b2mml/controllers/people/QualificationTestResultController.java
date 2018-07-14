package es.uca.b2mml.controllers.people;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.people.QualificationTestResult;

@RequestMapping("/qualificationtestresults")
@Controller
@RooWebScaffold(path = "qualificationtestresults", formBackingObject = QualificationTestResult.class)
public class QualificationTestResultController {

	// TODO: limit the person properties that can be related to a person class
	// property through the test result and test specification.

}
