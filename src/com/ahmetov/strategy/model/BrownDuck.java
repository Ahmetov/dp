package com.ahmetov.strategy.model;

import com.ahmetov.strategy.behavior.impl.DuckQuack;
import com.ahmetov.strategy.behavior.impl.FlyWithWings;

public class BrownDuck extends Duck{
    public BrownDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new DuckQuack();
    }
}
