// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.controllers.product;

import es.uca.b2mml.controllers.product.ProductParameterController;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.product.ProductParameter;
import es.uca.b2mml.domain.product.ProductSegment;
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

privileged aspect ProductParameterController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String ProductParameterController.create(@Valid ProductParameter productParameter, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, productParameter);
            return "productparameters/create";
        }
        uiModel.asMap().clear();
        productParameter.persist();
        return "redirect:/productparameters/" + encodeUrlPathSegment(productParameter.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String ProductParameterController.createForm(Model uiModel) {
        populateEditForm(uiModel, new ProductParameter());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (ProductSegment.countProductSegments() == 0) {
            dependencies.add(new String[] { "productsegment", "productsegments" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "productparameters/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String ProductParameterController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("productparameter", ProductParameter.findProductParameter(id));
        uiModel.addAttribute("itemId", id);
        return "productparameters/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String ProductParameterController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("productparameters", ProductParameter.findProductParameterEntries(firstResult, sizeNo));
            float nrOfPages = (float) ProductParameter.countProductParameters() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("productparameters", ProductParameter.findAllProductParameters());
        }
        return "productparameters/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String ProductParameterController.update(@Valid ProductParameter productParameter, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, productParameter);
            return "productparameters/update";
        }
        uiModel.asMap().clear();
        productParameter.merge();
        return "redirect:/productparameters/" + encodeUrlPathSegment(productParameter.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String ProductParameterController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, ProductParameter.findProductParameter(id));
        return "productparameters/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String ProductParameterController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        ProductParameter productParameter = ProductParameter.findProductParameter(id);
        productParameter.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/productparameters";
    }
    
    void ProductParameterController.populateEditForm(Model uiModel, ProductParameter productParameter) {
        uiModel.addAttribute("productParameter", productParameter);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("productsegments", ProductSegment.findAllProductSegments());
    }
    
    String ProductParameterController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
