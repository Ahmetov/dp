package com.ahmetov.strategy.model;

import com.ahmetov.strategy.behavior.impl.FlyNone;
import com.ahmetov.strategy.behavior.impl.SilenceQuack;

public class ToyDuck extends Duck{
    //use super only to access hided fields or if you just override methods (call old impl from base)
    public ToyDuck() {
        this.flyBehavior = new FlyNone();
        this.quackBehavior = new SilenceQuack();
    }
}
