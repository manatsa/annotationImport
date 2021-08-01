package com.mana.springannotation;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomConfiguration {
    public MyBean myBean(){
        return new MyBean();
    }
}