package com.ahmetov.strategy;

import com.ahmetov.strategy.model.BrownDuck;
import com.ahmetov.strategy.model.Duck;
import com.ahmetov.strategy.model.ToyDuck;

public class IntroMain {
    public static void main(String[] args) {
        Duck brownDuck = new BrownDuck();
        brownDuck.performFly();
        brownDuck.performQuack();

        Duck toyDuck = new ToyDuck();
        toyDuck.performFly();
        toyDuck.performQuack();
    }
}
