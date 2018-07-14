package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.QATestResult;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/qatestresults")
@Controller
@RooWebScaffold(path = "qatestresults", formBackingObject = QATestResult.class)
public class QATestResultController {
}
