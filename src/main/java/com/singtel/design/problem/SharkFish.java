package com.singtel.design.problem;

public class SharkFish extends Fish {
    public SharkFish(Size sz, Colour c, ISwimBehavior swimBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior, IFlyBehavior flyBehavior) {
        super(sz, c, swimBehavior, singBehavior, walkBehavior, flyBehavior);
    }

    public void eat(Fish f){
        if(f instanceof CrownFish)
            System.out.println("Shark fish can eat crown fish");
        else
            System.out.println("Shark fish can eat other fish");
    }
}
