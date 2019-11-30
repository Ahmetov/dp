package com.ahmetov.decorator.addon;

import com.ahmetov.decorator.beverage.Beverage;
import com.ahmetov.decorator.decorator.BeverageDecorator;

public class Mocha extends BeverageDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.98;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " mocha";
    }
}
