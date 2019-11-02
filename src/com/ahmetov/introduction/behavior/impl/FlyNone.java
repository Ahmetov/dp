package com.ahmetov.introduction.behavior.impl;

import com.ahmetov.introduction.behavior.FlyBehavior;

public class FlyNone implements FlyBehavior {
    @Override
    public void fly() { //should be empty but whatever
        System.out.println("<< Can't fly >>");
    }
}
