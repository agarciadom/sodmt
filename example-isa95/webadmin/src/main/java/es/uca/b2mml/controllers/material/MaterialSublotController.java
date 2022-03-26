package es.uca.b2mml.controllers.material;
import java.util.ArrayList;
import java.util.List;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialLotStatus;
import es.uca.b2mml.domain.material.MaterialSublot;

@RequestMapping("/materialsublots")
@Controller
@RooWebScaffold(path = "materialsublots", formBackingObject = MaterialSublot.class)
public class MaterialSublotController {
    @RequestMapping(params = "form", produces = "text/html")
    public String createForm(Model uiModel) {
        populateEditForm(uiModel, new MaterialSublot());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (MaterialLot.countMaterialLots() == 0) {
            dependencies.add(new String[] { "materiallot", "materiallots" });
        }
        if (MaterialLotStatus.countMaterialLotStatuses() == 0) {
            dependencies.add(new String[] { "materiallotstatus", "materiallotstatuses" });
        }
        if (Unit.countUnits() == 0) {
        	dependencies.add(new String[] { "unit", "units" });
        }
        if (Equipment.countEquipments() == 0) {
            dependencies.add(new String[] { "equipment", "equipments" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "materialsublots/create";
    }

    void populateEditForm(Model uiModel, MaterialSublot materialSublot) {
        uiModel.addAttribute("materialSublot", materialSublot);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("materiallots", MaterialLot.findAllMaterialLots());
        uiModel.addAttribute("materiallotstatuses", MaterialLotStatus.findAllMaterialLotStatuses());
        uiModel.addAttribute("materialsublots", MaterialSublot.findAllMaterialSublots());
    }
}
