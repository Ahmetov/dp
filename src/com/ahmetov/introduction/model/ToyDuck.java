package com.ahmetov.introduction.model;

import com.ahmetov.introduction.behavior.impl.DuckQuack;
import com.ahmetov.introduction.behavior.impl.FlyNone;
import com.ahmetov.introduction.behavior.impl.SilenceQuack;

public class ToyDuck extends Duck{
    //use super only to access hided fields or if you just override methods
    public ToyDuck() {
        this.flyBehavior = new FlyNone();
        this.quackBehavior = new SilenceQuack();
    }
}
