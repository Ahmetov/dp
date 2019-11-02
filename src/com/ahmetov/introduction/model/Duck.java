package com.ahmetov.introduction.model;

import com.ahmetov.introduction.behavior.FlyBehavior;
import com.ahmetov.introduction.behavior.QuackBehavior;

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
