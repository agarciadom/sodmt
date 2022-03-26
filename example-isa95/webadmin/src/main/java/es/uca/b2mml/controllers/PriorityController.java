package es.uca.b2mml.controllers;
import es.uca.b2mml.domain.Priority;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/priorities")
@Controller
@RooWebScaffold(path = "priorities", formBackingObject = Priority.class)
public class PriorityController {
}
