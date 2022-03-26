package es.uca.b2mml.controllers.capability;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.dates.DayFilter;
import es.uca.b2mml.forms.capability.GenerateCapabilitiesForm;
import es.uca.b2mml.service.capability.CapabilityService;

@RequestMapping("/gencapabilities/**")
@Controller
public class GenerateCapabilitiesController {

	@Autowired
	CapabilityService capabilitiesService;

	@RequestMapping(method = RequestMethod.POST, produces="text/html")
    public String post(@Valid final GenerateCapabilitiesForm formBacking, BindingResult bindingResult, Model model, RedirectAttributes attr) {
    	if (bindingResult.hasErrors()) {
    		populateForm(model, formBacking);
    		return "gencapabilities/index";
    	}

    	final DayFilter filter = new DayFilter() {
			@Override
			public boolean acceptDay(Calendar date) {
				switch (date.get(Calendar.DAY_OF_WEEK)) {
				case Calendar.MONDAY: return formBacking.getWorkMon();
				case Calendar.TUESDAY: return formBacking.getWorkTue();
				case Calendar.WEDNESDAY: return formBacking.getWorkWed();
				case Calendar.THURSDAY: return formBacking.getWorkThu();
				case Calendar.FRIDAY: return formBacking.getWorkFri();
				case Calendar.SATURDAY: return formBacking.getWorkSat();
				case Calendar.SUNDAY: return formBacking.getWorkSun();
				default: return false;
				}
			}
    	};

		final List<ProductionCapability> duplicates = capabilitiesService
				.duplicateDailyOverRange(formBacking.getTemplate(),
						formBacking.getStartDate(), formBacking.getEndDate(), filter);

		return "redirect:/gencapabilities/?generated=" + duplicates.size();
    }

    @RequestMapping(method = RequestMethod.GET, produces="text/html")
    public String index(@RequestParam(defaultValue = "0", required=false) Long generated, Model model) {
    	populateForm(model, new GenerateCapabilitiesForm());
    	model.addAttribute("generated", generated);
        return "gencapabilities/index";
    }

	private void populateForm(Model model, GenerateCapabilitiesForm backingObject) {
		model.addAttribute("generateCapabilitiesForm", backingObject);
    	model.addAttribute("date_format", org.joda.time.format.DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    	model.addAttribute("productionCapabilities", ProductionCapability.findAllCapabilitiesWithoutDates());
	}
}
