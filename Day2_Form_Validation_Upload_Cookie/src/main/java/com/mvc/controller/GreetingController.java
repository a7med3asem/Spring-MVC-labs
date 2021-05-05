package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
//    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(Map<String, Object> model){
        model.put("message", "Hello galal");
        return "greeting";
    }
}
