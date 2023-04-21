package com.example.DependencyInjection.controllerConfiguration;

import com.example.DependencyInjection.config.Config;
import com.example.DependencyInjection.model.Class3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(Config.class)
@RestController
public class ControllerConfig {

    private Class3 class3;

    @Autowired
    public ControllerConfig(Class3 class3) {
        this.class3 = class3;
    }

    @GetMapping(path="/config")
    public String getBeanByConstructor()
    {
        return class3.print();
    }

}
