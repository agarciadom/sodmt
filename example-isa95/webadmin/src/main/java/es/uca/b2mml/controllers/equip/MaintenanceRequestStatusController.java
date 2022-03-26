package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.MaintenanceRequestStatus;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/maintenancerequeststatuses")
@Controller
@RooWebScaffold(path = "maintenancerequeststatuses", formBackingObject = MaintenanceRequestStatus.class)
public class MaintenanceRequestStatusController {
}
