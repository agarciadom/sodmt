package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.perform.SegmentResponse;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/segmentresponses")
@Controller
@RooWebScaffold(path = "segmentresponses", formBackingObject = SegmentResponse.class)
public class SegmentResponseController {
}
