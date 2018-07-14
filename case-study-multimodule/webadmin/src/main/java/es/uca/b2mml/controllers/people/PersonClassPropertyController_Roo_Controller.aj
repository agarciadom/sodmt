// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.controllers.people;

import es.uca.b2mml.controllers.people.PersonClassPropertyController;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.people.PersonClass;
import es.uca.b2mml.domain.people.PersonClassProperty;
import es.uca.b2mml.domain.people.QualificationTestSpec;
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

privileged aspect PersonClassPropertyController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String PersonClassPropertyController.create(@Valid PersonClassProperty personClassProperty, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, personClassProperty);
            return "personclassproperties/create";
        }
        uiModel.asMap().clear();
        personClassProperty.persist();
        return "redirect:/personclassproperties/" + encodeUrlPathSegment(personClassProperty.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String PersonClassPropertyController.createForm(Model uiModel) {
        populateEditForm(uiModel, new PersonClassProperty());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (Unit.countUnits() == 0) {
            dependencies.add(new String[] { "unit", "units" });
        }
        if (PersonClass.countPersonClasses() == 0) {
            dependencies.add(new String[] { "personclass", "personclasses" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "personclassproperties/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String PersonClassPropertyController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("personclassproperty", PersonClassProperty.findPersonClassProperty(id));
        uiModel.addAttribute("itemId", id);
        return "personclassproperties/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String PersonClassPropertyController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("personclassproperties", PersonClassProperty.findPersonClassPropertyEntries(firstResult, sizeNo));
            float nrOfPages = (float) PersonClassProperty.countPersonClassProperties() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("personclassproperties", PersonClassProperty.findAllPersonClassProperties());
        }
        return "personclassproperties/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String PersonClassPropertyController.update(@Valid PersonClassProperty personClassProperty, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, personClassProperty);
            return "personclassproperties/update";
        }
        uiModel.asMap().clear();
        personClassProperty.merge();
        return "redirect:/personclassproperties/" + encodeUrlPathSegment(personClassProperty.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String PersonClassPropertyController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, PersonClassProperty.findPersonClassProperty(id));
        return "personclassproperties/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String PersonClassPropertyController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        PersonClassProperty personClassProperty = PersonClassProperty.findPersonClassProperty(id);
        personClassProperty.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/personclassproperties";
    }
    
    void PersonClassPropertyController.populateEditForm(Model uiModel, PersonClassProperty personClassProperty) {
        uiModel.addAttribute("personClassProperty", personClassProperty);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("personclasses", PersonClass.findAllPersonClasses());
        uiModel.addAttribute("qualificationtestspecs", QualificationTestSpec.findAllQualificationTestSpecs());
    }
    
    String PersonClassPropertyController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
