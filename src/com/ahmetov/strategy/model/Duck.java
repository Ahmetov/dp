package com.ahmetov.strategy.model;

import com.ahmetov.strategy.behavior.FlyBehavior;
import com.ahmetov.strategy.behavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;  //each duck fly differently (mostly cant -> empty impl)
    protected QuackBehavior quackBehavior;  //each quack fly differently

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void swim() {    //each duck has to swim
        System.out.println("Swimming!");
    }
}
