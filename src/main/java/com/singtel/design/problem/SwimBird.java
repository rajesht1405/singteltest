package com.singtel.design.problem;

/**
 * <p>
 *     Swim bird class.
 * </p>
 */
public abstract class SwimBird extends Bird {

    private ISwimBehavior swimBehavior;

    public ISwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public SwimBird(IFlyBehavior flyBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior,ISwimBehavior swimBehavior) {
        super(flyBehavior, singBehavior, walkBehavior);
        this.swimBehavior = swimBehavior;
    }

    public void performSwim(){
        swimBehavior.swim();
    }
}
