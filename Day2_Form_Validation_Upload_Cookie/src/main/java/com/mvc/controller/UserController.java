package com.mvc.controller;

import com.mvc.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/user")
    public User getUser(@RequestParam(value = "name", defaultValue = "ahmed") String name,
                        @RequestParam(value = "age", defaultValue = "25") int age){

        User user = new User();

        user.setUserName((name));
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("from postUser() : username is " + user.getUserName());

        return user;
    }
}
