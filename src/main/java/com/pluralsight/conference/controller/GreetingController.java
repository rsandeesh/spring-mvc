package com.pluralsight.conference.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GreetingController {


    @GetMapping("greeting")
    public String welcome(Map<String, Object> model) {
        model.put("message","Message is here");
        System.out.println("model = " + model);
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme(Map<String, Object> model) {
        model.put("message","Hello thymeleaf");
        System.out.println("model = " + model);
        return "thyme";
    }
}
