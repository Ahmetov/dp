package com.ahmetov.decorator;

import com.ahmetov.decorator.addon.Mocha;
import com.ahmetov.decorator.addon.Whip;
import com.ahmetov.decorator.beverage.Americano;
import com.ahmetov.decorator.beverage.Beverage;

public class DecoratorMain {
    public static void main(String[] args) {
        Beverage americanoWithDoubleMochaAndWhip = new Americano();
        americanoWithDoubleMochaAndWhip = new Mocha(americanoWithDoubleMochaAndWhip);
        americanoWithDoubleMochaAndWhip = new Mocha(americanoWithDoubleMochaAndWhip);
        americanoWithDoubleMochaAndWhip = new Whip(americanoWithDoubleMochaAndWhip);

        System.out.println(americanoWithDoubleMochaAndWhip.getDescription());
    }
}
