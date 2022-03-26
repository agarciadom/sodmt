package es.uca.b2mml.controllers.psegment;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;
import es.uca.b2mml.domain.psegment.PersonnelSegmentSpec;
import es.uca.b2mml.domain.psegment.PersonnelSegmentSpecProperty;
import es.uca.b2mml.domain.psegment.ProcessSegment;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelsegmentspecs")
@Controller
@RooWebScaffold(path = "personnelsegmentspecs", formBackingObject = PersonnelSegmentSpec.class)
public class PersonnelSegmentSpecController {
    void populateEditForm(Model uiModel, PersonnelSegmentSpec personnelSegmentSpec) {
        uiModel.addAttribute("personnelSegmentSpec", personnelSegmentSpec);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("people", Person.findAllPeople());
        uiModel.addAttribute("personclasses", PersonClass.findAllPersonClasses());
        uiModel.addAttribute("personnelsegmentspecproperties", PersonnelSegmentSpecProperty.findAllPersonnelSegmentSpecProperties());
        uiModel.addAttribute("processsegments", ProcessSegment.findAllProcessSegments());
    }
}
