package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class CookieController {

    @RequestMapping("cookie")
//    public String displayCookie(@CookieValue(value = "JSESSIONID", defaultValue = "testCookieValue") String cookieValue, Map<String, Object> model) {
    public String displayCookie(@CookieValue(value = "JSESSIONID", defaultValue = "testCookieValue") String cookieValue, Map<String, Object> model) {
        model.put("JSESSIONID",cookieValue);

        System.out.println("Cookie: " + cookieValue);
        return "cookie";
    }
}