package com.singtel.design.problem;

public abstract class CanNotFly implements IFlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
