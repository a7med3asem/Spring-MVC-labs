package com.practice.gettingStarted.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    //    Method
    @GetMapping("/greeting")
    public String greeting(ModelMap modelMap) {
        modelMap.put("message", "Hello there");

        return "greeting";
    }
}
