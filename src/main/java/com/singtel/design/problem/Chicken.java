package com.singtel.design.problem;

public class Chicken extends Bird {

    public Chicken(IFlyBehavior flyBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior) {
        super(flyBehavior, singBehavior, walkBehavior);
    }
}
