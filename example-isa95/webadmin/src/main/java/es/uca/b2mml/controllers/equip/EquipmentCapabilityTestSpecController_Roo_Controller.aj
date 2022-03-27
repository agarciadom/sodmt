// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.controllers.equip;

import es.uca.b2mml.controllers.equip.EquipmentCapabilityTestSpecController;
import es.uca.b2mml.domain.equip.EquipmentCapabilityTestSpec;
import es.uca.b2mml.domain.equip.EquipmentClassProperty;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect EquipmentCapabilityTestSpecController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String EquipmentCapabilityTestSpecController.create(@Valid EquipmentCapabilityTestSpec equipmentCapabilityTestSpec, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, equipmentCapabilityTestSpec);
            return "equipmentcapabilitytestspecs/create";
        }
        uiModel.asMap().clear();
        equipmentCapabilityTestSpec.persist();
        return "redirect:/equipmentcapabilitytestspecs/" + encodeUrlPathSegment(equipmentCapabilityTestSpec.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String EquipmentCapabilityTestSpecController.createForm(Model uiModel) {
        populateEditForm(uiModel, new EquipmentCapabilityTestSpec());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (EquipmentClassProperty.countEquipmentClassProperties() == 0) {
            dependencies.add(new String[] { "equipmentclassproperty", "equipmentclassproperties" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "equipmentcapabilitytestspecs/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String EquipmentCapabilityTestSpecController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("equipmentcapabilitytestspec", EquipmentCapabilityTestSpec.findEquipmentCapabilityTestSpec(id));
        uiModel.addAttribute("itemId", id);
        return "equipmentcapabilitytestspecs/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String EquipmentCapabilityTestSpecController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("equipmentcapabilitytestspecs", EquipmentCapabilityTestSpec.findEquipmentCapabilityTestSpecEntries(firstResult, sizeNo));
            float nrOfPages = (float) EquipmentCapabilityTestSpec.countEquipmentCapabilityTestSpecs() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("equipmentcapabilitytestspecs", EquipmentCapabilityTestSpec.findAllEquipmentCapabilityTestSpecs());
        }
        return "equipmentcapabilitytestspecs/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String EquipmentCapabilityTestSpecController.update(@Valid EquipmentCapabilityTestSpec equipmentCapabilityTestSpec, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, equipmentCapabilityTestSpec);
            return "equipmentcapabilitytestspecs/update";
        }
        uiModel.asMap().clear();
        equipmentCapabilityTestSpec.merge();
        return "redirect:/equipmentcapabilitytestspecs/" + encodeUrlPathSegment(equipmentCapabilityTestSpec.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String EquipmentCapabilityTestSpecController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, EquipmentCapabilityTestSpec.findEquipmentCapabilityTestSpec(id));
        return "equipmentcapabilitytestspecs/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String EquipmentCapabilityTestSpecController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        EquipmentCapabilityTestSpec equipmentCapabilityTestSpec = EquipmentCapabilityTestSpec.findEquipmentCapabilityTestSpec(id);
        equipmentCapabilityTestSpec.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/equipmentcapabilitytestspecs";
    }
    
    void EquipmentCapabilityTestSpecController.populateEditForm(Model uiModel, EquipmentCapabilityTestSpec equipmentCapabilityTestSpec) {
        uiModel.addAttribute("equipmentCapabilityTestSpec", equipmentCapabilityTestSpec);
        uiModel.addAttribute("equipmentclassproperties", EquipmentClassProperty.findAllEquipmentClassProperties());
    }
    
    String EquipmentCapabilityTestSpecController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}