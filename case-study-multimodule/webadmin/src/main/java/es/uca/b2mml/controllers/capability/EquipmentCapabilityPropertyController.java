package es.uca.b2mml.controllers.capability;
import es.uca.b2mml.domain.capability.EquipmentCapabilityProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentcapabilityproperties")
@Controller
@RooWebScaffold(path = "equipmentcapabilityproperties", formBackingObject = EquipmentCapabilityProperty.class)
public class EquipmentCapabilityPropertyController {
}
