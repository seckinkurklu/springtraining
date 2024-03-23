package com.cydeo.loosely_coupled.casefactory;

public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powersupply) {
        super(model, manufacturer, powersupply);
    }

    public void pressPowerButton(){

        System.out.println("Power button pressed");

    }

}
