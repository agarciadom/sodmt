package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.product.MaterialSpec;
import es.uca.b2mml.domain.product.MaterialSpecProperty;
import es.uca.b2mml.domain.product.ProductSegment;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialspecs")
@Controller
@RooWebScaffold(path = "materialspecs", formBackingObject = MaterialSpec.class)
public class MaterialSpecController {
    void populateEditForm(Model uiModel, MaterialSpec materialSpec) {
        uiModel.addAttribute("materialSpec", materialSpec);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("materialclasses", MaterialClass.findAllMaterialClasses());
        uiModel.addAttribute("materialdefinitions", MaterialDefinition.findAllMaterialDefinitions());
        uiModel.addAttribute("materialspecproperties", MaterialSpecProperty.findAllMaterialSpecProperties());
        uiModel.addAttribute("productsegments", ProductSegment.findAllProductSegments());
    }
}
