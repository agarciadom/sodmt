package es.uca.b2mml.controllers;
import es.uca.b2mml.domain.CapabilityType;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/capabilitytypes")
@Controller
@RooWebScaffold(path = "capabilitytypes", formBackingObject = CapabilityType.class)
public class CapabilityTypeController {
}
