package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.schedule.ProductionParameter;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productionparameters")
@Controller
@RooWebScaffold(path = "productionparameters", formBackingObject = ProductionParameter.class)
public class ProductionParameterController {
}
