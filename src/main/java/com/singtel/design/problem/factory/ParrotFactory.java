package com.singtel.design.problem.factory;

import com.singtel.design.problem.Parrot;
import com.singtel.design.problem.constants.ParrotTypes;
import com.singtel.design.problem.impl.CanFlyImpl;
import com.singtel.design.problem.impl.CanSingParrotWithCatImpl;
import com.singtel.design.problem.impl.CanSingParrotWithDogImpl;
import com.singtel.design.problem.impl.CanSingParrotWithRoosterImpl;
import com.singtel.design.problem.impl.CanWalkImpl;

public class ParrotFactory {

    public static Parrot getParrotInstance(ParrotTypes type){

        switch (type){
            case PARROT_WITH_CAT:
                return new Parrot(new CanFlyImpl(), new CanSingParrotWithCatImpl(), new CanWalkImpl());
            case PARROT_WITH_DOG:
                return new Parrot(new CanFlyImpl(), new CanSingParrotWithDogImpl(), new CanWalkImpl());
            case PARROT_WITH_ROOSTER:
                return new Parrot(new CanFlyImpl(), new CanSingParrotWithRoosterImpl(), new CanWalkImpl());
                default:
                    throw new IllegalArgumentException("Invalid input");
        }
    }
}
