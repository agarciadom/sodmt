package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.MaintenanceWorkOrder;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/maintenanceworkorders")
@Controller
@RooWebScaffold(path = "maintenanceworkorders", formBackingObject = MaintenanceWorkOrder.class)
public class MaintenanceWorkOrderController {
}
