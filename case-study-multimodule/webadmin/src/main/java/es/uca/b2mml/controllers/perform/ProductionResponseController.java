package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.perform.ProductionResponse;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productionresponses")
@Controller
@RooWebScaffold(path = "productionresponses", formBackingObject = ProductionResponse.class)
public class ProductionResponseController {
}
