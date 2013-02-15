package easyinheritance.web;

import easyinheritance.domain.D;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ds")
@Controller
@RooWebScaffold(path = "ds", formBackingObject = D.class)
public class DController {
}
