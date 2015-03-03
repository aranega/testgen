package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class FileController {

    /**
     * @generated
     */
    @RequestMapping("/file")
    public String index() {
        return "Greetings from FileController!";
    }

}
