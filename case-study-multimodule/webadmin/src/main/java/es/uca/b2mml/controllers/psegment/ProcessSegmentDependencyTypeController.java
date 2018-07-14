package es.uca.b2mml.controllers.psegment;
import es.uca.b2mml.domain.ExecutionDependencyType;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/processsegmentdependencytypes")
@Controller
@RooWebScaffold(path = "processsegmentdependencytypes", formBackingObject = ExecutionDependencyType.class)
public class ProcessSegmentDependencyTypeController {
}
