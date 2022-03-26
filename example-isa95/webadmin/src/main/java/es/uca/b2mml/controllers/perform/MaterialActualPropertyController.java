package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.perform.MaterialActualProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialactualproperties")
@Controller
@RooWebScaffold(path = "materialactualproperties", formBackingObject = MaterialActualProperty.class)
public class MaterialActualPropertyController {
}
