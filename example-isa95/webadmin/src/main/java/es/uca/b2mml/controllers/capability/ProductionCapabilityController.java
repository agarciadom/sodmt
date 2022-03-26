package es.uca.b2mml.controllers.capability;
import es.uca.b2mml.domain.capability.ProductionCapability;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productioncapabilities")
@Controller
@RooWebScaffold(path = "productioncapabilities", formBackingObject = ProductionCapability.class)
public class ProductionCapabilityController {
}
