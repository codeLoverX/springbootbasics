package com.dailycodebuffer.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HelloController {

//    @Value("${welcome.message}")
//    private String welcomeMesssage;
//
//    @GetMapping("/welcome")
//    public String helloWorld() {
//        return welcomeMesssage;
//    }

    @GetMapping(path="/")
    public RedirectView hello()
    {
        return new RedirectView("swagger-ui/index.html");
    }
}
