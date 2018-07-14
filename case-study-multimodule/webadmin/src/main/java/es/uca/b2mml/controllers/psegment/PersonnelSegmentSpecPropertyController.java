package es.uca.b2mml.controllers.psegment;
import es.uca.b2mml.domain.psegment.PersonnelSegmentSpecProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelsegmentspecproperties")
@Controller
@RooWebScaffold(path = "personnelsegmentspecproperties", formBackingObject = PersonnelSegmentSpecProperty.class)
public class PersonnelSegmentSpecPropertyController {
}
