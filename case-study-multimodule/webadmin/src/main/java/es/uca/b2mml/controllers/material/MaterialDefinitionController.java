package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.MaterialDefinition;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialdefinitions")
@Controller
@RooWebScaffold(path = "materialdefinitions", formBackingObject = MaterialDefinition.class)
public class MaterialDefinitionController {
}
