package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.MaterialUseType;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialusetypes")
@Controller
@RooWebScaffold(path = "materialusetypes", formBackingObject = MaterialUseType.class)
public class MaterialUseTypeController {
}
