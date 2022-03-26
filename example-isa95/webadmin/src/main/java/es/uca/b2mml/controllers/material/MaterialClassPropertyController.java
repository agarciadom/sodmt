package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.MaterialClassProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialclassproperties")
@Controller
@RooWebScaffold(path = "materialclassproperties", formBackingObject = MaterialClassProperty.class)
public class MaterialClassPropertyController {
}
