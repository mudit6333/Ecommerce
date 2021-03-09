package com.SpringBoot.SpringRestfulWeb.StaticFilterQues8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilterController {
    @GetMapping("/staticFiltering")
    public User staticFiltering() {
        User user = new User(101, "vinay", "password");
        return user;
    }

}
