package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.product.ProductProductionRule;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productionrules")
@Controller
@RooWebScaffold(path = "productionrules", formBackingObject = ProductProductionRule.class)
public class ProductProductionRuleController {
}
