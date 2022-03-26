package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.perform.ProductionData;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productiondatas")
@Controller
@RooWebScaffold(path = "productiondatas", formBackingObject = ProductionData.class)
public class ProductionDataController {
}
