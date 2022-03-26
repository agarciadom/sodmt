package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.MaterialLotProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materiallotproperties")
@Controller
@RooWebScaffold(path = "materiallotproperties", formBackingObject = MaterialLotProperty.class)
public class MaterialLotPropertyController {
}
