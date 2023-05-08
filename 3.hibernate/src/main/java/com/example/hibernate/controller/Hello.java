package com.example.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class Hello {
    @GetMapping(path="/")
    public RedirectView hello()
    {
        return new RedirectView("swagger-ui/index.html");
    }
}
