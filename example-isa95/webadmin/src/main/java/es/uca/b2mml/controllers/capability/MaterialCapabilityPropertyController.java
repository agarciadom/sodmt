package es.uca.b2mml.controllers.capability;
import es.uca.b2mml.domain.capability.MaterialCapabilityProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialcapabilityproperties")
@Controller
@RooWebScaffold(path = "materialcapabilityproperties", formBackingObject = MaterialCapabilityProperty.class)
public class MaterialCapabilityPropertyController {
}
