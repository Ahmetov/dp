package com.ahmetov.decorator.beverage;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.2;
    }
}
