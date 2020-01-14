package com.singtel.design.problem;

import com.singtel.design.problem.impl.CanNotFlyImpl;
import com.singtel.design.problem.impl.CanSwimImpl;
import com.singtel.design.problem.impl.CanWalkImpl;
import com.singtel.design.problem.impl.DuckSingImpl;

public class Duck extends SwimBird {
    public Duck(IFlyBehavior flyBehavior, ISingBehavior singBehavior, IWalkBehavior walkBehavior, ISwimBehavior swimBehavior) {
        super(flyBehavior, singBehavior, walkBehavior, swimBehavior);
    }


  /*  public Duck(){
        super(new CanNotFlyImpl(), new DuckSingImpl(), new CanWalkImpl(), new CanSwimImpl());
    }*/
}
