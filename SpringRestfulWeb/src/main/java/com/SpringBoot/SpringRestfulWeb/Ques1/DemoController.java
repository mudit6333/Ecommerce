package com.SpringBoot.SpringRestfulWeb.Ques1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return  "welcome to spring boot ";
    }

    @GetMapping("/welcome-bean")
    public BeanExample function() {
        return new BeanExample("welcome to spring boot ");
    }
    @GetMapping("/welcome/pathvariable/{name}")
    public BeanExample pathVariable(@PathVariable String name) {
        return new BeanExample("welcome to spring boot "+name);
    }

}
