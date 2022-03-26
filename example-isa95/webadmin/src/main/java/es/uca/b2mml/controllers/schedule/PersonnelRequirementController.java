package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;
import es.uca.b2mml.domain.schedule.PersonnelRequirement;
import es.uca.b2mml.domain.schedule.PersonnelRequirementProperty;
import es.uca.b2mml.domain.schedule.SegmentRequirement;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelrequirements")
@Controller
@RooWebScaffold(path = "personnelrequirements", formBackingObject = PersonnelRequirement.class)
public class PersonnelRequirementController {
    void populateEditForm(Model uiModel, PersonnelRequirement personnelRequirement) {
        uiModel.addAttribute("personnelRequirement", personnelRequirement);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("people", Person.findAllPeople());
        uiModel.addAttribute("personclasses", PersonClass.findAllPersonClasses());
        uiModel.addAttribute("personnelrequirementproperties", PersonnelRequirementProperty.findAllPersonnelRequirementProperties());
        uiModel.addAttribute("segmentrequirements", SegmentRequirement.findAllSegmentRequirements());
    }
}
