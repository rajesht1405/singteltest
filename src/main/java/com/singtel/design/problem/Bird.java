package com.singtel.design.problem;

/**
 * <P>
 *     Abstract Bird class to hold common operations.
 * </P>
 */
public abstract class Bird implements IAnimal {
    // All behavior references.
    private IFlyBehavior flyBehavior;
    private ISingBehavior singBehavior;
    private IWalkBehavior walkBehavior;

    public Bird(IFlyBehavior flyBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior){
        this.flyBehavior = flyBehavior;
        this.singBehavior = singBehavior;
        this.walkBehavior = walkBehavior;
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public ISingBehavior getSingBehavior() {
        return singBehavior;
    }

    public IWalkBehavior getWalkBehavior() {
        return walkBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSing() {
        singBehavior.sing();
    }

    public void perFormWalk() {
        walkBehavior.walk();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSingBehavior(ISingBehavior singBehavior) {
        this.singBehavior = singBehavior;
    }

    public void setWalkBehavior(IWalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }
}