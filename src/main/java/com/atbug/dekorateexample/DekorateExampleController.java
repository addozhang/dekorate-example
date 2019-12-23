package com.atbug.dekorateexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Addo.Zhang
 * @date 2019/12/23
 */
@RestController
public class DekorateExampleController {

    @GetMapping
    public String hi() {
        return "Hello World";
    }

}
