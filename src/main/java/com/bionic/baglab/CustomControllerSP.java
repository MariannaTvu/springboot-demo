package com.bionic.baglab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Potaychuk Sviatoslav on 11.03.2017.
 */
@RestController
public class CustomControllerSP {
    @RequestMapping("/hello2")
    public String sayHello(){
        return "Hello  2  from CustomControllerSP!";
    }
}
