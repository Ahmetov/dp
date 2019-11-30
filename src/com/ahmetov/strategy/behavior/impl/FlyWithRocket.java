package com.ahmetov.strategy.behavior.impl;

import com.ahmetov.strategy.behavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("To the moon!!!");
    }
}
