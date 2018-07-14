package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.QATestSpec;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/qatestspecs")
@Controller
@RooWebScaffold(path = "qatestspecs", formBackingObject = QATestSpec.class)
public class QATestSpecController {
}
