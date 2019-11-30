package com.ahmetov.strategy.behavior.impl;

import com.ahmetov.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Look! I'm flying with my own wings!");
    }
}
