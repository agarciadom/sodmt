package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.product.MaterialSpecProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialspecproperties")
@Controller
@RooWebScaffold(path = "materialspecproperties", formBackingObject = MaterialSpecProperty.class)
public class MaterialSpecPropertyController {
}
