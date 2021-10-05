package com.company;

import java.util.Locale;

public class Car {
    //state fields with private access modifier to accomplish encapsulation
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //this is why we use constructor as setter, so we can add model without violating our encapsulation
    public void setModel(String model){
        String validModel = model.toLowerCase();
        // validation
        if(validModel.equals("carrera") || validModel.equals("q5")) {
            this.model =  model;
        } else this.model = "Unknown";

    }

    public String getModel() {
        return this.model;
    }
}
