package com.ahmetov.decorator.addon;

import com.ahmetov.decorator.beverage.Beverage;
import com.ahmetov.decorator.decorator.BeverageDecorator;

public class Decaf extends BeverageDecorator {
    private Beverage beverage;

    public Decaf(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " decaf";
    }
}
