package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Bryan")String firstname,
                        @RequestParam(value = "firstname", defaultValue = "Bryan")String lastname,
                        @RequestParam(value = "firstname", defaultValue = "Bryan")int age) {
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);
        return user;
    }
}
