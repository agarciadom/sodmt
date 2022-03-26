package es.uca.b2mml.controllers.capability;
import java.util.Arrays;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.capability.MaterialCapability;
import es.uca.b2mml.domain.capability.MaterialCapabilityProperty;
import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.material.MaterialUseType;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/materialcapabilities")
@Controller
@RooWebScaffold(path = "materialcapabilities", formBackingObject = MaterialCapability.class)
public class MaterialCapabilityController {
    void populateEditForm(Model uiModel, MaterialCapability materialCapability) {
        uiModel.addAttribute("materialCapability", materialCapability);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("capabilitytypes", Arrays.asList(CapabilityType.values()));
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("materialcapabilityproperties", MaterialCapabilityProperty.findAllMaterialCapabilityProperties());
        uiModel.addAttribute("productioncapabilities", ProductionCapability.findAllProductionCapabilities());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("materialclasses", MaterialClass.findAllMaterialClasses());
        uiModel.addAttribute("materialdefinitions", MaterialDefinition.findAllMaterialDefinitions());
        uiModel.addAttribute("materiallots", MaterialLot.findAllMaterialLots());
        uiModel.addAttribute("materialsublots", MaterialSublot.findAllMaterialSublots());
        uiModel.addAttribute("materialusetypes", Arrays.asList(MaterialUseType.values()));
    }
}
