package com.singtel.design.problem;

import com.singtel.design.problem.impl.BirdImpl;
import com.singtel.design.problem.impl.CanFlyImpl;
import com.singtel.design.problem.impl.CanNotFlyImpl;
import com.singtel.design.problem.impl.CanSwimImpl;
import com.singtel.design.problem.impl.CanWalkImpl;
import com.singtel.design.problem.impl.ChickenSingImpl;
import com.singtel.design.problem.impl.DuckSingImpl;

/**
 * <p>
 *     Solution class.
 * </p>
 */
public class Solution {
    public static void main(String[] args) {
//1. Can you implement the sing() method for the bird?
        Bird bird = new BirdImpl();
        bird.performFly();
        bird.performSing();
        bird.perFormWalk();


        //2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

        SwimBird swimBird = new Duck(new CanNotFlyImpl(), new DuckSingImpl(), new CanWalkImpl(), new CanSwimImpl());
        swimBird.performFly();
        swimBird.performSing();
        swimBird.perFormWalk();
        swimBird.performSwim();

        Bird chicken = new Chicken(new CanFlyImpl(), new ChickenSingImpl(), new CanWalkImpl());
        chicken.performFly();;
        chicken.performSing();
        chicken.perFormWalk();
    }
}
