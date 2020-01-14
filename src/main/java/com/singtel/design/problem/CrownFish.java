package com.singtel.design.problem;

public class CrownFish extends  Fish {
    public CrownFish(Size sz, Colour c, ISwimBehavior swimBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior, IFlyBehavior flyBehavior) {
        super(sz, c, swimBehavior, singBehavior, walkBehavior, flyBehavior);
    }

    public void makeJokes(){
        System.out.println("Crown fish can crack jokes");
    }
}
