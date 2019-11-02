package com.ahmetov.introduction.model;

import com.ahmetov.introduction.behavior.impl.DuckQuack;
import com.ahmetov.introduction.behavior.impl.FlyNone;
import com.ahmetov.introduction.behavior.impl.FlyWithWings;

public class BrownDuck extends Duck{
    public BrownDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new DuckQuack();
    }
}
