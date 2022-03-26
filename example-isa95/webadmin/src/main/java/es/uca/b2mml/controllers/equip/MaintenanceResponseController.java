package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.MaintenanceResponse;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/maintenanceresponses")
@Controller
@RooWebScaffold(path = "maintenanceresponses", formBackingObject = MaintenanceResponse.class)
public class MaintenanceResponseController {
}
