package com.singtel.design.problem;

/**
 * <p>
 *     Abstract class that provide default implementation for sing behavior.
 * </p>
 */
public abstract class CanSing implements ISingBehavior{

    public void sing() {
        System.out.println("I can Sing");
    }
}
