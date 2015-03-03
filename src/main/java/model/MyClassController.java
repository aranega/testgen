package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class MyClassController {

    /**
     * @generated
     */
    @RequestMapping("/myclass")
    public String index() {
        return "Greetings from MyClassController!";
    }

}
