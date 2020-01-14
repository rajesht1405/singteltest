package com.singtel.design.problem;

public abstract class Fish implements IAnimal {

    private ISwimBehavior swimBehavior;
    private ISingBehavior singBehavior;
    private IWalkBehavior walkBehavior;
    private IFlyBehavior flyBehavior;

    protected enum Size {LARGE, SMALL};
    protected enum Colour {GREY, ORANGE};
    protected Size size;
    protected Colour colour;

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public Colour getColour() {
        return colour;
    }
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void performSwim(){
        this.swimBehavior.swim();;
    }

    public void performSing(){
        this.singBehavior.sing();
    }

    public void performWalk(){
        this.walkBehavior.walk();
    }

    public void performFly(){
        this.flyBehavior.fly();
    }
    public Fish(Size sz, Colour c, ISwimBehavior swimBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior, IFlyBehavior flyBehavior){
        this.size = sz;
        this.colour = c;
        this.swimBehavior=swimBehavior;
        this.singBehavior = singBehavior;
        this.walkBehavior = walkBehavior;
        this.flyBehavior = flyBehavior;
    }

}
