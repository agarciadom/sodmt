package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.perform.ProductionPerformance;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productionperformances")
@Controller
@RooWebScaffold(path = "productionperformances", formBackingObject = ProductionPerformance.class)
public class ProductionPerformanceController {
}
