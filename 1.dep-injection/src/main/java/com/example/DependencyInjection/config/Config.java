package com.example.DependencyInjection.config;

import com.example.DependencyInjection.model.Class3;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mail")
//@EnableAutoConfiguration finds all @Config and @Component
// cannot clash with xml config
public class Config {
    @Bean
//    @Bean is at component level and method level, too unlike component scan only.
    public Class3 myClass() {
        return new Class3();
    }

}