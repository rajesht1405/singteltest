package com.singtel.design.problem;

/**
 * <p>
 *     Abstract class that provide default implementation for Walk behavior.
 * </p>
 */
public abstract class CanWalk implements IWalkBehavior{

    public void walk() {
        System.out.println("I can walk");
    }
}
