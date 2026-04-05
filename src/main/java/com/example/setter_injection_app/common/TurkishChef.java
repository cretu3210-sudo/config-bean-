package com.example.setter_injection_app.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef {

    public TurkishChef(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void initializareBean() {
        System.out.println("Bean initialized. " + getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Bean is about to be destroyed." + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Kebab";
    }
}
