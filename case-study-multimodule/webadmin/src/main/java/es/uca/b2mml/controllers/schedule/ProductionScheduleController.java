package es.uca.b2mml.controllers.schedule;
import es.uca.b2mml.domain.schedule.ProductionSchedule;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productionschedules")
@Controller
@RooWebScaffold(path = "productionschedules", formBackingObject = ProductionSchedule.class)
public class ProductionScheduleController {
}
