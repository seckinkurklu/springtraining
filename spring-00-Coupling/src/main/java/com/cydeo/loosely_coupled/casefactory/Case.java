package com.cydeo.loosely_coupled.casefactory;

public abstract class Case {

    private String model;
    private String manufacturer;
    private String powersupply;

    public Case(String model, String manufacturer, String powersupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
    }



}
