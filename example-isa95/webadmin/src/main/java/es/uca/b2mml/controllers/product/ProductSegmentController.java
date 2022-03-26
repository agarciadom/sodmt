package es.uca.b2mml.controllers.product;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.product.EquipmentSpec;
import es.uca.b2mml.domain.product.MaterialSpec;
import es.uca.b2mml.domain.product.PersonnelSpec;
import es.uca.b2mml.domain.product.ProductParameter;
import es.uca.b2mml.domain.product.ProductProductionRule;
import es.uca.b2mml.domain.product.ProductSegment;
import es.uca.b2mml.domain.psegment.ProcessSegment;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productsegments")
@Controller
@RooWebScaffold(path = "productsegments", formBackingObject = ProductSegment.class)
public class ProductSegmentController {
    void populateEditForm(Model uiModel, ProductSegment productSegment) {
        uiModel.addAttribute("productSegment", productSegment);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipmentspecs", EquipmentSpec.findAllEquipmentSpecs());
        uiModel.addAttribute("materialspecs", MaterialSpec.findAllMaterialSpecs());
        uiModel.addAttribute("personnelspecs", PersonnelSpec.findAllPersonnelSpecs());
        uiModel.addAttribute("productparameters", ProductParameter.findAllProductParameters());
        uiModel.addAttribute("productproductionrules", ProductProductionRule.findAllProductProductionRules());
        uiModel.addAttribute("productsegments", ProductSegment.findAllProductSegments());
        uiModel.addAttribute("processsegments", ProcessSegment.findAllProcessSegments());
    }
}
