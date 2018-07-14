package es.uca.b2mml.controllers.schedule;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.product.ProductSegment;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.schedule.ProductionRequest;
import es.uca.b2mml.domain.schedule.SegmentRequirement;

@RequestMapping("/segmentrequirements")
@Controller
@RooWebScaffold(path = "segmentrequirements", formBackingObject = SegmentRequirement.class)
public class SegmentRequirementController {
    void populateEditForm(Model uiModel, SegmentRequirement segmentRequirement) {
        uiModel.addAttribute("segmentRequirement", segmentRequirement);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("productsegments", ProductSegment.findAllProductSegments());
        uiModel.addAttribute("processsegments", ProcessSegment.findAllProcessSegments());
        uiModel.addAttribute("productionrequests", ProductionRequest.findAllProductionRequests());
    }
}
