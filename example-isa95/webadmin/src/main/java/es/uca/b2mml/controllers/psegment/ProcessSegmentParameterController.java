package es.uca.b2mml.controllers.psegment;
import es.uca.b2mml.domain.psegment.ProcessSegmentParameter;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/processsegmentparameters")
@Controller
@RooWebScaffold(path = "processsegmentparameters", formBackingObject = ProcessSegmentParameter.class)
public class ProcessSegmentParameterController {
}
