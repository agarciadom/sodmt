package es.uca.b2mml.controllers.capability;
import es.uca.b2mml.domain.capability.PersonnelCapabilityProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/personnelcapabilityproperties")
@Controller
@RooWebScaffold(path = "personnelcapabilityproperties", formBackingObject = PersonnelCapabilityProperty.class)
public class PersonnelCapabilityPropertyController {
}
