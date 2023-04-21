package com.example.DependencyInjection.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Class1 {

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
