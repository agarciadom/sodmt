package es.uca.b2mml.controllers.equip;
import es.uca.b2mml.domain.equip.EquipmentCapabilityTestResult;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentcapabilitytestresults")
@Controller
@RooWebScaffold(path = "equipmentcapabilitytestresults", formBackingObject = EquipmentCapabilityTestResult.class)
public class EquipmentCapabilityTestResultController {
}
