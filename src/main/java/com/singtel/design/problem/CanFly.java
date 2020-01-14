package com.singtel.design.problem;

/**
 * <p>
 *     Abstract class that provide default implementation for fly behavior.
 * </p>
 */
public abstract class CanFly implements IFlyBehavior {

    public void fly() {
        System.out.println("I can fly");
    }
}
