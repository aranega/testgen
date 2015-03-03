package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class DirectoryController {

    /**
     * @generated NOT
     */
    @RequestMapping("/directory")
    public String index() {
        return "<HTML><BODY>My body</BODY></HTML>";
    }

}
