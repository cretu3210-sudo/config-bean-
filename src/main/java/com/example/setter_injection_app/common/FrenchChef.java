package com.example.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class FrenchChef implements Chef {

    public FrenchChef(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe() {
        return "Oeufs mimosa au thon, câpres et anchois";
    }






}
