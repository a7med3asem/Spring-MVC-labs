package com.mvc.controller;

import com.mvc.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
//@RequestMapping(value = "/zabady")
public class RegistrationController {

    // GetMapping apply only on method level
    //@GetMapping(value = "registration")

    // class level or method level
    // Default get method
    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String getRegistration(@ModelAttribute("registration") Registration registration){

        return "registration";
    }

//    @RequestMapping(value = "registration", method = RequestMethod.POST)
//    @RequestMapping(value = "registration")
    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result){

        if(result.hasErrors()){
            System.out.println("obaa .. da fe errors");
            return "registration";
        }

        System.out.println("Registered name is " + registration.getName());

//        return "registration";
//        return "forward:registration";
        return "redirect:registration";
    }


}
