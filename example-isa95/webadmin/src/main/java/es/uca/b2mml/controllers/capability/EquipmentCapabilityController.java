package es.uca.b2mml.controllers.capability;
import java.util.Arrays;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.capability.EquipmentCapability;
import es.uca.b2mml.domain.capability.EquipmentCapabilityProperty;
import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;

@RequestMapping("/equipmentcapabilities")
@Controller
@RooWebScaffold(path = "equipmentcapabilities", formBackingObject = EquipmentCapability.class)
public class EquipmentCapabilityController {
    void populateEditForm(Model uiModel, EquipmentCapability equipmentCapability) {
        uiModel.addAttribute("equipmentCapability", equipmentCapability);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("capabilitytypes", Arrays.asList(CapabilityType.values()));
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipmentcapabilityproperties", EquipmentCapabilityProperty.findAllEquipmentCapabilityProperties());
        uiModel.addAttribute("productioncapabilities", ProductionCapability.findAllProductionCapabilities());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("equipmentclasses", EquipmentClass.findAllEquipmentClasses());
    }
}
