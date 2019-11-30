package com.ahmetov.decorator.beverage;

public abstract class Beverage {
    public abstract double cost();

    public String getDescription() {
        return "Unknown beverage";
    }
}
