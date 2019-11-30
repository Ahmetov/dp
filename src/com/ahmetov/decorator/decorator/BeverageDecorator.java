package com.ahmetov.decorator.decorator;

import com.ahmetov.decorator.beverage.Beverage;

//  inheritance needs for type security
public abstract class BeverageDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
