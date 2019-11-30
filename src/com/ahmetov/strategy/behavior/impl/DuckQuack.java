package com.ahmetov.strategy.behavior.impl;

import com.ahmetov.strategy.behavior.QuackBehavior;

public class DuckQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack! I'm dog!");
    }
}
