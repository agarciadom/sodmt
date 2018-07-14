package es.uca.b2mml.controllers.psegment;
import es.uca.b2mml.domain.psegment.EquipmentSegmentSpecProperty;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/equipmentsegmentspecproperties")
@Controller
@RooWebScaffold(path = "equipmentsegmentspecproperties", formBackingObject = EquipmentSegmentSpecProperty.class)
public class EquipmentSegmentSpecPropertyController {
}
