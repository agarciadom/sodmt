package es.uca.b2mml.controllers.psegment;
import java.util.Arrays;

import es.uca.b2mml.domain.ExecutionDependencyType;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.psegment.ProcessSegmentDependency;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/processsegmentdependencies")
@Controller
@RooWebScaffold(path = "processsegmentdependencies", formBackingObject = ProcessSegmentDependency.class)
public class ProcessSegmentDependencyController {
    void populateEditForm(Model uiModel, ProcessSegmentDependency processSegmentDependency) {
        final ExecutionDependencyType[] dependencyTypes = ExecutionDependencyType.values();

        uiModel.addAttribute("processSegmentDependency", processSegmentDependency);
		uiModel.addAttribute("executiondependencytypes", Arrays.asList(dependencyTypes));
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("processsegments", ProcessSegment.findAllProcessSegments());
    }
}
