package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.product.PersonnelSpecProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelspecproperties")
@Controller
@RooWebScaffold(path = "personnelspecproperties", formBackingObject = PersonnelSpecProperty.class)
public class PersonnelSpecPropertyController {
}
