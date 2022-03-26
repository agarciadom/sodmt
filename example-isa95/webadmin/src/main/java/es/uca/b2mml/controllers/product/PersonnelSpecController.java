package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;
import es.uca.b2mml.domain.product.PersonnelSpec;
import es.uca.b2mml.domain.product.PersonnelSpecProperty;
import es.uca.b2mml.domain.product.ProductSegment;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelspecs")
@Controller
@RooWebScaffold(path = "personnelspecs", formBackingObject = PersonnelSpec.class)
public class PersonnelSpecController {
    void populateEditForm(Model uiModel, PersonnelSpec personnelSpec) {
        uiModel.addAttribute("personnelSpec", personnelSpec);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("people", Person.findAllPeople());
        uiModel.addAttribute("personclasses", PersonClass.findAllPersonClasses());
        uiModel.addAttribute("personnelspecproperties", PersonnelSpecProperty.findAllPersonnelSpecProperties());
        uiModel.addAttribute("productsegments", ProductSegment.findAllProductSegments());
    }
}
