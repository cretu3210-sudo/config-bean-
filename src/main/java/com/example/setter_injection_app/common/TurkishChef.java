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


    @Override
    public String getDailyRecipe() {
        return "Kebab";
    }
}
