package com.ahmetov.introduction.behavior.impl;

import com.ahmetov.introduction.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Look! I'm flying with my own wings!");
    }
}
