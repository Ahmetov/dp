package com.ahmetov.strategy.behavior.impl;

import com.ahmetov.strategy.behavior.QuackBehavior;

public class SilenceQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
