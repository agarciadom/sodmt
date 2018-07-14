package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.MaterialClass;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialclasses")
@Controller
@RooWebScaffold(path = "materialclasses", formBackingObject = MaterialClass.class)
public class MaterialClassController {
}
