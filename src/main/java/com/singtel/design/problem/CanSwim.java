package com.singtel.design.problem;

/**
 * <p>
 *     Abstract class that provide default implementation for swim behavior.
 * </p>
 */
public abstract class CanSwim implements ISwimBehavior{
    public void swim() {
        System.out.println("I can swim");
    }
}
