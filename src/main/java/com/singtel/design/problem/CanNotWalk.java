package com.singtel.design.problem;

public abstract class CanNotWalk implements IWalkBehavior {
    public void walk() {
        System.out.println("I can't walk");
    }
}
