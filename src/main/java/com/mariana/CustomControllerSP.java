package com.mariana;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Potaychuk Sviatoslav on 11.03.2017.
 */
@RestController
public class CustomControllerSP {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello from CustomControllerSP!";
    }
}
