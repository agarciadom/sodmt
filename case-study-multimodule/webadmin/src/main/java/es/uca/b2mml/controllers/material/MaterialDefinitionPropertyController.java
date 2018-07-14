package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.MaterialDefinitionProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialdefinitionproperties")
@Controller
@RooWebScaffold(path = "materialdefinitionproperties", formBackingObject = MaterialDefinitionProperty.class)
public class MaterialDefinitionPropertyController {
}
