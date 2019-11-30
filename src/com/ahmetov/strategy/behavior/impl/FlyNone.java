package com.ahmetov.strategy.behavior.impl;

import com.ahmetov.strategy.behavior.FlyBehavior;

public class FlyNone implements FlyBehavior {
    @Override
    public void fly() { //should be empty but whatever
        System.out.println("<< Can't fly >>");
    }
}
