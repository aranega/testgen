package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class DirectoryController {

    /**
     * @generated
     */
    @RequestMapping("/directory")
    public String index() {
        return "Greetings from DirectoryController!";
    }

}
