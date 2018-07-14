package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.EquipmentCapabilityTestSpec;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentcapabilitytestspecs")
@Controller
@RooWebScaffold(path = "equipmentcapabilitytestspecs", formBackingObject = EquipmentCapabilityTestSpec.class)
public class EquipmentCapabilityTestSpecController {
}
