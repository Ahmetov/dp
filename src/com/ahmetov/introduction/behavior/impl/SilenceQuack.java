package com.ahmetov.introduction.behavior.impl;

import com.ahmetov.introduction.behavior.QuackBehavior;

public class SilenceQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
