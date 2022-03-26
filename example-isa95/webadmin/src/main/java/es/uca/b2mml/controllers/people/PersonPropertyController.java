package es.uca.b2mml.controllers.people;
import java.util.ArrayList;
import java.util.List;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonProperty;

@RequestMapping("/personproperties")
@Controller
@RooWebScaffold(path = "personproperties", formBackingObject = PersonProperty.class)
public class PersonPropertyController {
    @RequestMapping(params = "form", produces = "text/html")
    public String createForm(Model uiModel) {
        populateEditForm(uiModel, new PersonProperty());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (Person.countPeople() == 0) {
        	dependencies.add(new String[] { "person", "people" });
        }
        if (Unit.countUnits() == 0) {
            dependencies.add(new String[] { "unit", "units" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "personproperties/create";
    }
}
