package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.MaintenanceResponseStatus;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/maintenanceresponsestatuses")
@Controller
@RooWebScaffold(path = "maintenanceresponsestatuses", formBackingObject = MaintenanceResponseStatus.class)
public class MaintenanceResponseStatusController {
}
