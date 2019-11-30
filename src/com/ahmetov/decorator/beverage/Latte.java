package com.ahmetov.decorator.beverage;

public class Latte extends Beverage {
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double cost() {
        return 1.9;
    }
}
