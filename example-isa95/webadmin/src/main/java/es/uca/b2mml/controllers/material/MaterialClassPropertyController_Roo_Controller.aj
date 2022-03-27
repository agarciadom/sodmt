// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.controllers.material;

import es.uca.b2mml.controllers.material.MaterialClassPropertyController;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialClassProperty;
import es.uca.b2mml.domain.material.QATestSpec;
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

privileged aspect MaterialClassPropertyController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String MaterialClassPropertyController.create(@Valid MaterialClassProperty materialClassProperty, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, materialClassProperty);
            return "materialclassproperties/create";
        }
        uiModel.asMap().clear();
        materialClassProperty.persist();
        return "redirect:/materialclassproperties/" + encodeUrlPathSegment(materialClassProperty.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String MaterialClassPropertyController.createForm(Model uiModel) {
        populateEditForm(uiModel, new MaterialClassProperty());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (Unit.countUnits() == 0) {
            dependencies.add(new String[] { "unit", "units" });
        }
        if (MaterialClass.countMaterialClasses() == 0) {
            dependencies.add(new String[] { "materialclass", "materialclasses" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "materialclassproperties/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String MaterialClassPropertyController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("materialclassproperty", MaterialClassProperty.findMaterialClassProperty(id));
        uiModel.addAttribute("itemId", id);
        return "materialclassproperties/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String MaterialClassPropertyController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("materialclassproperties", MaterialClassProperty.findMaterialClassPropertyEntries(firstResult, sizeNo));
            float nrOfPages = (float) MaterialClassProperty.countMaterialClassProperties() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("materialclassproperties", MaterialClassProperty.findAllMaterialClassProperties());
        }
        return "materialclassproperties/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String MaterialClassPropertyController.update(@Valid MaterialClassProperty materialClassProperty, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, materialClassProperty);
            return "materialclassproperties/update";
        }
        uiModel.asMap().clear();
        materialClassProperty.merge();
        return "redirect:/materialclassproperties/" + encodeUrlPathSegment(materialClassProperty.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String MaterialClassPropertyController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, MaterialClassProperty.findMaterialClassProperty(id));
        return "materialclassproperties/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String MaterialClassPropertyController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        MaterialClassProperty materialClassProperty = MaterialClassProperty.findMaterialClassProperty(id);
        materialClassProperty.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/materialclassproperties";
    }
    
    void MaterialClassPropertyController.populateEditForm(Model uiModel, MaterialClassProperty materialClassProperty) {
        uiModel.addAttribute("materialClassProperty", materialClassProperty);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("materialclasses", MaterialClass.findAllMaterialClasses());
        uiModel.addAttribute("qatestspecs", QATestSpec.findAllQATestSpecs());
    }
    
    String MaterialClassPropertyController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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