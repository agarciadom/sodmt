package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.product.ProductParameter;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productparameters")
@Controller
@RooWebScaffold(path = "productparameters", formBackingObject = ProductParameter.class)
public class ProductParameterController {
}
