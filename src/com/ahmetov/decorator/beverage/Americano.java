package com.ahmetov.decorator.beverage;

public class Americano extends Beverage {

    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double cost() {
        return 2.4;
    }
}
