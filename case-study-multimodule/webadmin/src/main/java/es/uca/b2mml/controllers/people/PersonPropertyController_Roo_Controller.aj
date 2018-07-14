// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.controllers.people;

import es.uca.b2mml.controllers.people.PersonPropertyController;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonProperty;
import es.uca.b2mml.domain.people.QualificationTestResult;
import java.io.UnsupportedEncodingException;
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

privileged aspect PersonPropertyController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String PersonPropertyController.create(@Valid PersonProperty personProperty, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, personProperty);
            return "personproperties/create";
        }
        uiModel.asMap().clear();
        personProperty.persist();
        return "redirect:/personproperties/" + encodeUrlPathSegment(personProperty.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String PersonPropertyController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("personproperty", PersonProperty.findPersonProperty(id));
        uiModel.addAttribute("itemId", id);
        return "personproperties/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String PersonPropertyController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("personproperties", PersonProperty.findPersonPropertyEntries(firstResult, sizeNo));
            float nrOfPages = (float) PersonProperty.countPersonProperties() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("personproperties", PersonProperty.findAllPersonProperties());
        }
        return "personproperties/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String PersonPropertyController.update(@Valid PersonProperty personProperty, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, personProperty);
            return "personproperties/update";
        }
        uiModel.asMap().clear();
        personProperty.merge();
        return "redirect:/personproperties/" + encodeUrlPathSegment(personProperty.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String PersonPropertyController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, PersonProperty.findPersonProperty(id));
        return "personproperties/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String PersonPropertyController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        PersonProperty personProperty = PersonProperty.findPersonProperty(id);
        personProperty.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/personproperties";
    }
    
    void PersonPropertyController.populateEditForm(Model uiModel, PersonProperty personProperty) {
        uiModel.addAttribute("personProperty", personProperty);
        uiModel.addAttribute("units", Unit.findAllUnits());
        uiModel.addAttribute("people", Person.findAllPeople());
        uiModel.addAttribute("qualificationtestresults", QualificationTestResult.findAllQualificationTestResults());
    }
    
    String PersonPropertyController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
