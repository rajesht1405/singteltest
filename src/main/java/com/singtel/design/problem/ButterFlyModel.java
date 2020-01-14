package com.singtel.design.problem;

public abstract class ButterFlyModel implements IAnimal {

    public ButterFlyModel(IFlyBehavior flyBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior) {
        this.flyBehavior = flyBehavior;
        this.singBehavior = singBehavior;
        this.walkBehavior = walkBehavior;
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public ISingBehavior getSingBehavior() {
        return singBehavior;
    }

    public void setSingBehavior(ISingBehavior singBehavior) {
        this.singBehavior = singBehavior;
    }

    public IWalkBehavior getWalkBehavior() {
        return walkBehavior;
    }

    public void setWalkBehavior(IWalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    private IFlyBehavior flyBehavior;
    private ISingBehavior singBehavior;
    private IWalkBehavior walkBehavior;


    public void perfromSing(){
        this.singBehavior.sing();
    }

    public void perfromFly(){
       this.flyBehavior.fly();
    }

    public void perfromWalk(){
       this.walkBehavior.walk();
    }

}
