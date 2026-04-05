package com.example.setter_injection_app.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary

@Component

public class MexicanChef implements Chef {

    public MexicanChef(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Tacos";
    }
}
