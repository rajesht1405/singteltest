package com.singtel.design.problem.factory;

import com.singtel.design.problem.Chicken;
import com.singtel.design.problem.constants.ChickenTypeEnum;
import com.singtel.design.problem.impl.CanNotFlyImpl;
import com.singtel.design.problem.impl.CanWalkImpl;
import com.singtel.design.problem.impl.ChickenSingImpl;
import com.singtel.design.problem.impl.RoosterSingImpl;

/**
 * <p>
 *     Chicken factory for creating instances.
 * </p>
 */
public class ChickenTypeFactory {

    public static Chicken getChickenInstance(ChickenTypeEnum x){

        switch(x) {
            case CHECKEN:
                return new Chicken(new CanNotFlyImpl(), new ChickenSingImpl(), new CanWalkImpl());
            case ROOSTER:
                return new Chicken(new CanNotFlyImpl(), new RoosterSingImpl(), new CanWalkImpl());

            default:
                System.out.println("nothing found");
                throw new IllegalArgumentException("Invalid input");
        }
    }
}
