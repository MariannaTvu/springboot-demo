package com.bionic.baglab.controls;

import com.bionic.baglab.dto.UserMessageDTO;
import com.bionic.baglab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


/**
 * Created by Maryana on 11.03.2017.
 */
@RestController
public class UserControler {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String sayHello(){
        return userService.getHello();
    }

    @RequestMapping("/model")
    public UserMessageDTO sayHi(){
        return userService.getModel();
    }

    @RequestMapping("/show/{id}")
    public String sayHelloId(@PathVariable Optional<Integer> id){
        return "You typed "+ id.get();
    }

    @RequestMapping("/news")
    public String changedNews(){
        return "News should be here!";
    }

}
