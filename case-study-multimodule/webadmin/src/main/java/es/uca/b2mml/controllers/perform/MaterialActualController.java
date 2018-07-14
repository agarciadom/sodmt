package es.uca.b2mml.controllers.perform;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.perform.MaterialActual;
import es.uca.b2mml.domain.perform.MaterialActualProperty;
import es.uca.b2mml.domain.perform.SegmentResponse;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialactuals")
@Controller
@RooWebScaffold(path = "materialactuals", formBackingObject = MaterialActual.class)
public class MaterialActualController {
    void populateEditForm(Model uiModel, MaterialActual materialActual) {
        uiModel.addAttribute("materialActual", materialActual);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("materialclasses", MaterialClass.findAllMaterialClasses());
        uiModel.addAttribute("materialdefinitions", MaterialDefinition.findAllMaterialDefinitions());
        uiModel.addAttribute("materiallots", MaterialLot.findAllMaterialLots());
        uiModel.addAttribute("materialsublots", MaterialSublot.findAllMaterialSublots());
        uiModel.addAttribute("materialactualproperties", MaterialActualProperty.findAllMaterialActualProperties());
        uiModel.addAttribute("segmentresponses", SegmentResponse.findAllSegmentResponses());
    }
}
