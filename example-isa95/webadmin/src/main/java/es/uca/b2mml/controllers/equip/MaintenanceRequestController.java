package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.MaintenanceRequest;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/maintenancerequests")
@Controller
@RooWebScaffold(path = "maintenancerequests", formBackingObject = MaintenanceRequest.class)
public class MaintenanceRequestController {
}
