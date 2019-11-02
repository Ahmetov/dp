package com.ahmetov.introduction.behavior.impl;

import com.ahmetov.introduction.behavior.QuackBehavior;

public class DuckQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack! I'm dog!");
    }
}
