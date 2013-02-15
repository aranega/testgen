// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package easyinheritance.web;

import easyinheritance.domain.D;
import easyinheritance.domain.MyC;
import easyinheritance.web.MyCController;
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

privileged aspect MyCController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String MyCController.create(@Valid MyC myC, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, myC);
            return "mycs/create";
        }
        uiModel.asMap().clear();
        myC.persist();
        return "redirect:/mycs/" + encodeUrlPathSegment(myC.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String MyCController.createForm(Model uiModel) {
        populateEditForm(uiModel, new MyC());
        return "mycs/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String MyCController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("myc", MyC.findMyC(id));
        uiModel.addAttribute("itemId", id);
        return "mycs/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String MyCController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("mycs", MyC.findMyCEntries(firstResult, sizeNo));
            float nrOfPages = (float) MyC.countMyCs() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("mycs", MyC.findAllMyCs());
        }
        return "mycs/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String MyCController.update(@Valid MyC myC, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, myC);
            return "mycs/update";
        }
        uiModel.asMap().clear();
        myC.merge();
        return "redirect:/mycs/" + encodeUrlPathSegment(myC.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String MyCController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, MyC.findMyC(id));
        return "mycs/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String MyCController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        MyC myC = MyC.findMyC(id);
        myC.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/mycs";
    }
    
    void MyCController.populateEditForm(Model uiModel, MyC myC) {
        uiModel.addAttribute("myC", myC);
        uiModel.addAttribute("ds", D.findAllDS());
    }
    
    String MyCController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
