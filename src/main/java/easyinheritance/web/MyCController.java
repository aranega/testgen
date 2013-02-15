package easyinheritance.web;

import easyinheritance.domain.MyC;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mycs")
@Controller
@RooWebScaffold(path = "mycs", formBackingObject = MyC.class)
public class MyCController {
}
