package es.uca.b2mml.controllers.product;
import java.util.Arrays;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.ExecutionDependencyType;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.product.ProductSegment;
import es.uca.b2mml.domain.product.ProductSegmentDependency;

@RequestMapping("/productsegmentdependencies")
@Controller
@RooWebScaffold(path = "productsegmentdependencies", formBackingObject = ProductSegmentDependency.class)
public class ProductSegmentDependencyController {
    void populateEditForm(Model uiModel, ProductSegmentDependency productSegmentDependency) {
        uiModel.addAttribute("productSegmentDependency", productSegmentDependency);
        uiModel.addAttribute("executiondependencytypes", Arrays.asList(ExecutionDependencyType.values()));
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("productsegments", ProductSegment.findAllProductSegments());
    }
}
