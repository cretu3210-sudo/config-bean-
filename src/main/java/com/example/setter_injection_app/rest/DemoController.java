package com.example.setter_injection_app.rest;

import com.example.setter_injection_app.common.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {


    private Chef myChef;

    @Autowired
    public DemoController(@Qualifier("turkishChef") Chef theChef) {

        myChef = theChef;
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();

    }
}