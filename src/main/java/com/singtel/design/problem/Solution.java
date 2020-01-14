package com.singtel.design.problem;

import com.singtel.design.problem.impl.BirdImpl;

/**
 * <p>
 *     Solution class.
 * </p>
 */
public class Solution {
    public static void main(String[] args) {

        Bird bird = new BirdImpl();
        bird.performFly();
        bird.performSing();
        bird.perFormWalk();
    }
}
