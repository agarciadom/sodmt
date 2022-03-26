package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.MaintenanceOrderStatus;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/maintenanceorderstatuses")
@Controller
@RooWebScaffold(path = "maintenanceorderstatuses", formBackingObject = MaintenanceOrderStatus.class)
public class MaintenanceOrderStatusController {
}
