package easyinheritance.web;

import easyinheritance.domain.MyA;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/myas")
@Controller
@RooWebScaffold(path = "myas", formBackingObject = MyA.class)
public class MyAController {
}
