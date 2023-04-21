package com.example.DependencyInjection.controllerXML;

import com.example.DependencyInjection.model.Class1;
import com.example.DependencyInjection.model.Class2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@ImportResource("classpath:spring.xml")
//Or use ApplicationContext
//@EnableAutoConfiguration finds all @Config and @Component
//but there's no @EnableAutoXML
public class ControllerXMLAutowired {

/*  field/ property injection
    Easiest but avoided most because 2 many seperate injections
    @Autowired
    private XMLClass xmlClass;
*/
    private Class1 class1;
    private Class2 class2;

    /*
    It allows Spring to resolve and inject collaborating beans into our bean.
    constructor injection is strict (so better in testing)
    it is most recommended as all recommended at same time
    */
    @Autowired
    public ControllerXMLAutowired(Class1 class1, Class2 class2) {
        this.class1 = class1;
        this.class2 = class2;
    }

/*
    Setter field/ property injection
    @Autowired
    @Required
    //  must inject this or class may not be injected (so avoided second-most)
    public setControllerXML(XMLClass xmlClass) {
        this.xmlClass = xmlClass;
    }
*/

    @GetMapping(path="/")
    public RedirectView hello()
    {
        return new RedirectView("swagger-ui/index.html");
    }

    @GetMapping(path="/xmlSetter")
    public String getBeanBySetter()
    {
        return class1.print() + " avoid setter injection";
    }

    @GetMapping(path="/xmlConstructor")
    public String getBeanByConstructor()
    {
        return class2.print();
    }

}
