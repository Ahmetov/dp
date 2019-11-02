package com.ahmetov.introduction;

import com.ahmetov.introduction.model.BrownDuck;
import com.ahmetov.introduction.model.Duck;
import com.ahmetov.introduction.model.ToyDuck;

public class IntroMain {
    public static void main(String[] args) {
        Duck brownDuck = new BrownDuck();
        brownDuck.performFly();
        brownDuck.performQuack();

        Duck toyDuck = new ToyDuck();
        toyDuck.performFly();
        toyDuck.performQuack();
    }
}
