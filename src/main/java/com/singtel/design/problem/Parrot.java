package com.singtel.design.problem;

public class Parrot extends Bird {
    public Parrot(IFlyBehavior flyBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior) {
        super(flyBehavior, singBehavior, walkBehavior);
    }
}
