package com.singtel.design.problem.impl;

import com.singtel.design.problem.Bird;

public class BirdImpl extends Bird {
    public BirdImpl() {
        setFlyBehavior(new CanFlyImpl());
        setSingBehavior(new CanSingImpl());
        setWalkBehavior(new CanWalkImpl());
    }
}