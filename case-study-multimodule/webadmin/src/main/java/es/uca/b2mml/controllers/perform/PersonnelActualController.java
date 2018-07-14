package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;
import es.uca.b2mml.domain.perform.PersonnelActual;
import es.uca.b2mml.domain.perform.PersonnelActualProperty;
import es.uca.b2mml.domain.perform.SegmentResponse;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelactuals")
@Controller
@RooWebScaffold(path = "personnelactuals", formBackingObject = PersonnelActual.class)
public class PersonnelActualController {
    void populateEditForm(Model uiModel, PersonnelActual personnelActual) {
        uiModel.addAttribute("personnelActual", personnelActual);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("people", Person.findAllPeople());
        uiModel.addAttribute("personclasses", PersonClass.findAllPersonClasses());
        uiModel.addAttribute("personnelactualproperties", PersonnelActualProperty.findAllPersonnelActualProperties());
        uiModel.addAttribute("segmentresponses", SegmentResponse.findAllSegmentResponses());
    }
}
