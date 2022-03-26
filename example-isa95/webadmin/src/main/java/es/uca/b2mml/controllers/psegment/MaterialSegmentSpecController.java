package es.uca.b2mml.controllers.psegment;

import java.util.Arrays;
import java.util.List;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialUseType;
import es.uca.b2mml.domain.psegment.MaterialSegmentSpec;
import es.uca.b2mml.domain.psegment.MaterialSegmentSpecProperty;
import es.uca.b2mml.domain.psegment.ProcessSegment;

@RequestMapping("/materialsegmentspecs")
@Controller
@RooWebScaffold(path = "materialsegmentspecs", formBackingObject = MaterialSegmentSpec.class)
public class MaterialSegmentSpecController {

	@RequestMapping(produces = "text/html")
	public String list(
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "orderBy", required = false) String orderBy, 
			Model uiModel) {
		List<String> orderByList = null;
		if (orderBy != null) {
			orderByList = Arrays.asList(orderBy.split(","));
		}

		if (page != null || size != null) {
			int sizeNo = size == null ? 10 : size.intValue();
			final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
			uiModel.addAttribute("materialsegmentspecs", MaterialSegmentSpec.findMaterialSegmentSpecEntries(orderByList, firstResult, sizeNo));
			float nrOfPages = (float) MaterialSegmentSpec.countMaterialSegmentSpecs() / sizeNo;
			uiModel.addAttribute(
					"maxPages",
					(int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1
							: nrOfPages));
		} else {
			uiModel.addAttribute("materialsegmentspecs", MaterialSegmentSpec.findAllMaterialSegmentSpecs(orderByList));
		}
		return "materialsegmentspecs/list";
	}

	void populateEditForm(Model uiModel, MaterialSegmentSpec materialSegmentSpec) {
        uiModel.addAttribute("materialSegmentSpec", materialSegmentSpec);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("materialclasses", MaterialClass.findAllMaterialClasses());
        uiModel.addAttribute("materialdefinitions", MaterialDefinition.findAllMaterialDefinitions());
        uiModel.addAttribute("materialusetypes", Arrays.asList(MaterialUseType.values()));
        uiModel.addAttribute("materialsegmentspecproperties", MaterialSegmentSpecProperty.findAllMaterialSegmentSpecProperties());
        uiModel.addAttribute("processsegments", ProcessSegment.findAllProcessSegments());
    }
    

}
