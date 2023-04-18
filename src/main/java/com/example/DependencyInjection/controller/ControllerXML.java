package com.example.DependencyInjection.controller;

import com.example.DependencyInjection.model.XMLClass;
import com.example.DependencyInjection.model.XMLClass2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;

@RestController
@Configuration
@ImportResource("classpath:spring.xml")

public class ControllerXML {

    @Autowired
    private XMLClass xmlClass;

    @Autowired
    private XMLClass2 xmlClass2;

    @GetMapping(path="/")
    public String hello()
    {
        return "Hello World New";
    }

    @GetMapping(path="/xmlSetter")
    public String getBeanBySetter()
    {
        return xmlClass.print();
    }

    @GetMapping(path="/xmlConstructor")
    public String getBeanByConstructor()
    {
        return xmlClass2.print();
    }

}
