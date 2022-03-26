package es.uca.b2mml.controllers.material;
import es.uca.b2mml.domain.material.MaterialLot;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materiallots")
@Controller
@RooWebScaffold(path = "materiallots", formBackingObject = MaterialLot.class)
public class MaterialLotController {
}
