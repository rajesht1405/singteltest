package com.singtel.design.problem.impl;

import com.singtel.design.problem.Bird;

/**
 * <p>
 *     Bird implementation class. for eg: peagion,
 * </p>
 */
public class BirdImpl extends Bird {
    public BirdImpl() {
        super(new CanFlyImpl(),new CanSingImpl(),new CanWalkImpl());

    }
}