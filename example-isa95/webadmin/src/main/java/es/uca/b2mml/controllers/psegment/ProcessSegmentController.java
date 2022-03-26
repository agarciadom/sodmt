package es.uca.b2mml.controllers.psegment;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.psegment.EquipmentSegmentSpec;
import es.uca.b2mml.domain.psegment.MaterialSegmentSpec;
import es.uca.b2mml.domain.psegment.PersonnelSegmentSpec;
import es.uca.b2mml.domain.psegment.ProcessSegment;

@RequestMapping("/processsegments")
@Controller
@RooWebScaffold(path = "processsegments", formBackingObject = ProcessSegment.class)
public class ProcessSegmentController {
	void populateEditForm(Model uiModel, ProcessSegment processSegment) {
        uiModel.addAttribute("processSegment", processSegment);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("equipmentsegmentspecs", EquipmentSegmentSpec.findAllEquipmentSegmentSpecs());
        uiModel.addAttribute("materialsegmentspecs", MaterialSegmentSpec.findAllMaterialSegmentSpecs());
        uiModel.addAttribute("personnelsegmentspecs", PersonnelSegmentSpec.findAllPersonnelSegmentSpecs());
        uiModel.addAttribute("processsegments", ProcessSegment.findAllProcessSegments());
    }
}
