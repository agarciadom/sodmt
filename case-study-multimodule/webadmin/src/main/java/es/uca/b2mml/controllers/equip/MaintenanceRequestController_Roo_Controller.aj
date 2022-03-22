// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.controllers.equip;

import es.uca.b2mml.controllers.equip.MaintenanceRequestController;
import es.uca.b2mml.domain.Priority;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.MaintenanceRequest;
import es.uca.b2mml.domain.equip.MaintenanceRequestStatus;
import es.uca.b2mml.domain.people.Person;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect MaintenanceRequestController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String MaintenanceRequestController.create(@Valid MaintenanceRequest maintenanceRequest, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, maintenanceRequest);
            return "maintenancerequests/create";
        }
        uiModel.asMap().clear();
        maintenanceRequest.persist();
        return "redirect:/maintenancerequests/" + encodeUrlPathSegment(maintenanceRequest.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String MaintenanceRequestController.createForm(Model uiModel) {
        populateEditForm(uiModel, new MaintenanceRequest());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (Equipment.countEquipments() == 0) {
            dependencies.add(new String[] { "equipment", "equipments" });
        }
        if (Priority.countPriorities() == 0) {
            dependencies.add(new String[] { "priority", "priorities" });
        }
        if (Person.countPeople() == 0) {
            dependencies.add(new String[] { "person", "people" });
        }
        if (MaintenanceRequestStatus.countMaintenanceRequestStatuses() == 0) {
            dependencies.add(new String[] { "maintenancerequeststatus", "maintenancerequeststatuses" });
        }
        if (Person.countPeople() == 0) {
            dependencies.add(new String[] { "person", "people" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "maintenancerequests/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String MaintenanceRequestController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("maintenancerequest", MaintenanceRequest.findMaintenanceRequest(id));
        uiModel.addAttribute("itemId", id);
        return "maintenancerequests/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String MaintenanceRequestController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("maintenancerequests", MaintenanceRequest.findMaintenanceRequestEntries(firstResult, sizeNo));
            float nrOfPages = (float) MaintenanceRequest.countMaintenanceRequests() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("maintenancerequests", MaintenanceRequest.findAllMaintenanceRequests());
        }
        addDateTimeFormatPatterns(uiModel);
        return "maintenancerequests/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String MaintenanceRequestController.update(@Valid MaintenanceRequest maintenanceRequest, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, maintenanceRequest);
            return "maintenancerequests/update";
        }
        uiModel.asMap().clear();
        maintenanceRequest.merge();
        return "redirect:/maintenancerequests/" + encodeUrlPathSegment(maintenanceRequest.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String MaintenanceRequestController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, MaintenanceRequest.findMaintenanceRequest(id));
        return "maintenancerequests/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String MaintenanceRequestController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        MaintenanceRequest maintenanceRequest = MaintenanceRequest.findMaintenanceRequest(id);
        maintenanceRequest.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/maintenancerequests";
    }
    
    void MaintenanceRequestController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("maintenanceRequest_requestedcompletiondate_date_format", DateTimeFormat.patternForStyle("SS", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("maintenanceRequest_submissiondate_date_format", DateTimeFormat.patternForStyle("SS", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("maintenanceRequest_publisheddate_date_format", DateTimeFormat.patternForStyle("SS", LocaleContextHolder.getLocale()));
    }
    
    void MaintenanceRequestController.populateEditForm(Model uiModel, MaintenanceRequest maintenanceRequest) {
        uiModel.addAttribute("maintenanceRequest", maintenanceRequest);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("priorities", Priority.findAllPriorities());
        uiModel.addAttribute("equipments", Equipment.findAllEquipments());
        uiModel.addAttribute("maintenancerequeststatuses", MaintenanceRequestStatus.findAllMaintenanceRequestStatuses());
        uiModel.addAttribute("people", Person.findAllPeople());
    }
    
    String MaintenanceRequestController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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