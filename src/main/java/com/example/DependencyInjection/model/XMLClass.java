package com.example.DependencyInjection.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@AllArgsConstructor
@NoArgsConstructor
public class XMLClass {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String password;

    public String print()
    {
        return name + " &&& "+ password;
    }
}