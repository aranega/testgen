package easyinheritance.web;

import easyinheritance.domain.B;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/bs")
@Controller
@RooWebScaffold(path = "bs", formBackingObject = B.class)
public class BController {
}
