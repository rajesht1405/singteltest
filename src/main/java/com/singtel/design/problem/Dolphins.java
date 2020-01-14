package com.singtel.design.problem;

public class Dolphins implements IAnimal {

    public Dolphins(ISwimBehavior swimBehavior){
        this.swimBehavior = swimBehavior;
    }
    private ISwimBehavior swimBehavior;

    public void performSwim(){
        this.swimBehavior.swim();
    }
}
