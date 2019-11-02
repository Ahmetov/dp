package com.ahmetov.introduction.behavior.impl;

import com.ahmetov.introduction.behavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("To the moon!!!");
    }
}
