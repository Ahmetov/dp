package com.ahmetov.decorator.addon;

import com.ahmetov.decorator.beverage.Beverage;
import com.ahmetov.decorator.decorator.BeverageDecorator;

public class Whip extends BeverageDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " whip";
    }
}
