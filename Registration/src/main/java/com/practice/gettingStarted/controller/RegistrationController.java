package com.practice.gettingStarted.controller;

import com.practice.gettingStarted.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
//@RequestMapping(value = "registration")
public class RegistrationController {

    // GetMapping apply only on method level
    //@GetMapping(value = "registration")

    // class level or method level
//    @RequestMapping(value = "registration", method = RequestMethod.GET)
//    public String getRegistration() {
//        return getRegistration();
//    }

    // class level or method level
    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String getRegistration(@ModelAttribute("registration") Registration registration) {

        return "registration";
    }

    //    @RequestMapping(value = "registration", method = RequestMethod.POST)
    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("Oh .. da fe errors");
            return "registration";
        }

        System.out.println("Registered name is " + registration.getName());

//        return "registration";
//        return "forward:registration";
        return "redirect:registration";
    }
}
