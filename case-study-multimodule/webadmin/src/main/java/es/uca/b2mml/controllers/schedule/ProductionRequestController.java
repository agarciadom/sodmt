package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.schedule.ProductionRequest;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productionrequests")
@Controller
@RooWebScaffold(path = "productionrequests", formBackingObject = ProductionRequest.class)
public class ProductionRequestController {
}
