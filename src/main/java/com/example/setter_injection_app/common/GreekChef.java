package com.example.setter_injection_app.common;

public class GreekChef implements Chef {

    public GreekChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Greek salad";
    }
}
