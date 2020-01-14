package com.singtel.design.problem;

import com.singtel.design.problem.constants.ChickenTypeEnum;
import com.singtel.design.problem.constants.ParrotTypes;
import com.singtel.design.problem.factory.ChickenTypeFactory;
import com.singtel.design.problem.factory.ParrotFactory;
import com.singtel.design.problem.impl.BirdImpl;
import com.singtel.design.problem.impl.CanFlyImpl;
import com.singtel.design.problem.impl.CanNotFlyImpl;
import com.singtel.design.problem.impl.CanNotSingImpl;
import com.singtel.design.problem.impl.CanNotWalkImpl;
import com.singtel.design.problem.impl.CanSwimImpl;
import com.singtel.design.problem.impl.CanWalkImpl;
import com.singtel.design.problem.impl.ChickenSingImpl;
import com.singtel.design.problem.impl.DuckSingImpl;

/**
 * <p>
 *     Solution class.
 * </p>
 */
public class Solution {
    public static void main(String[] args) {
//1. Can you implement the sing() method for the bird?
        Bird bird = new BirdImpl();
        bird.performFly();
        bird.performSing();
        bird.perFormWalk();


        //2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

        SwimBird swimBird = new Duck(new CanNotFlyImpl(), new DuckSingImpl(), new CanWalkImpl(), new CanSwimImpl());
        swimBird.performFly();
        swimBird.performSing();
        swimBird.perFormWalk();
        swimBird.performSwim();

        Bird chicken = new Chicken(new CanNotFlyImpl(), new ChickenSingImpl(), new CanWalkImpl());
        chicken.performFly();;
        chicken.performSing();
        chicken.perFormWalk();

        //3. Now how would you model a rooster?
        Bird rooster = ChickenTypeFactory.getChickenInstance(ChickenTypeEnum.ROOSTER);
        rooster.perFormWalk();
        rooster.performFly();
        rooster.performSing();

        //4. Can you model a parrot? We are specifically interested in three parrots,

        Parrot parrot = ParrotFactory.getParrotInstance(ParrotTypes.PARROT_WITH_CAT);
        parrot.performFly();
        parrot.performSing();
        parrot.perFormWalk();;

        parrot = ParrotFactory.getParrotInstance(ParrotTypes.PARROT_WITH_DOG);
        parrot.performFly();
        parrot.performSing();
        parrot.perFormWalk();

        parrot = ParrotFactory.getParrotInstance(ParrotTypes.PARROT_WITH_ROOSTER);
        parrot.performFly();
        parrot.performSing();
        parrot.perFormWalk();

        //B. Model fish as well as other swimming animals(1, 2, 3)
        SharkFish fish = new SharkFish(Fish.Size.LARGE, Fish.Colour.GREY,new CanSwimImpl(),new CanNotSingImpl(), new CanNotWalkImpl(), new CanNotFlyImpl());
        fish.performFly();
        fish.performSing();
        fish.performSwim();
        fish.performWalk();
        fish.eat(new CrownFish(Fish.Size.SMALL, Fish.Colour.ORANGE, new CanSwimImpl(),new CanNotSingImpl(), new CanNotWalkImpl(), new CanNotFlyImpl()));

        CrownFish crownFish = new CrownFish(Fish.Size.SMALL, Fish.Colour.ORANGE, new CanSwimImpl(),new CanNotSingImpl(), new CanNotWalkImpl(), new CanNotFlyImpl());
        crownFish.makeJokes();
        crownFish.performFly();
        crownFish.performSing();
        crownFish.performWalk();
        crownFish.performSwim();

        Dolphins dolphins = new Dolphins(new CanSwimImpl());
        dolphins.performSwim();

        //D. Model animals that change their behaviour over time
        ButterFlyModel butterFly = new ButterFly(new CanFlyImpl(), new CanNotSingImpl(), new CanWalkImpl());
        butterFly.perfromFly();
        butterFly.perfromSing();
        butterFly.perfromWalk();

        butterFly = new Caterpillar(new CanNotFlyImpl(), new CanNotSingImpl(), new CanWalkImpl());
        butterFly.perfromFly();
        butterFly.perfromSing();
        butterFly.perfromWalk();

        //E. Counting animals
        BirdImpl bird1 = new BirdImpl();
       Duck duck= new Duck(new CanNotFlyImpl(), new DuckSingImpl(), new CanWalkImpl(), new CanSwimImpl());;
        Chicken chicken1 = new Chicken(new CanNotFlyImpl(), new ChickenSingImpl(), new CanWalkImpl());
        Chicken chicken2  = ChickenTypeFactory.getChickenInstance(ChickenTypeEnum.ROOSTER);
        Parrot parrot1 = ParrotFactory.getParrotInstance(ParrotTypes.PARROT_WITH_ROOSTER);
        SharkFish fish1 = new SharkFish(Fish.Size.LARGE, Fish.Colour.GREY,new CanSwimImpl(),new CanNotSingImpl(), new CanNotWalkImpl(), new CanNotFlyImpl());
        CrownFish crownFish1 = new CrownFish(Fish.Size.SMALL, Fish.Colour.ORANGE, new CanSwimImpl(),new CanNotSingImpl(), new CanNotWalkImpl(), new CanNotFlyImpl());
        Dolphins dolphins1 = new Dolphins(new CanSwimImpl());
        ButterFlyModel butterFly1 = new ButterFly(new CanFlyImpl(), new CanNotSingImpl(), new CanWalkImpl());

        IAnimal[] animals = new IAnimal[]{bird1,duck,chicken1,chicken2, parrot1, fish1, crownFish1, dolphins1, butterFly1};

        int countFly = 0;
        int countSing = 0;
        int countSwim = 0;
        int countWalk = 0;

        for (IAnimal animal:animals) {

            if(animal instanceof Bird) {
                if(animal instanceof SwimBird) {
                    SwimBird s = (SwimBird) animal;
                    if (s.getSwimBehavior() instanceof CanSwim)
                        countSwim++;
                }
                Bird s = (Bird) animal;
                    if(s.getFlyBehavior() instanceof CanFly )
                        countFly++;
                    if(s.getWalkBehavior() instanceof CanWalk )
                        countWalk++;
                    if(s.getSingBehavior() instanceof CanSing )
                        countSing++;

            }else if(animal instanceof Fish){
                Fish s = (Fish) animal;
                if(s.getFlyBehavior() instanceof CanFly )
                    countFly++;
                if(s.getWalkBehavior() instanceof CanWalk )
                    countWalk++;
                if(s.getSingBehavior() instanceof CanSing )
                    countSing++;
                if (s.getSwimBehavior() instanceof CanSwim)
                    countSwim++;
            } else if(animal instanceof ButterFlyModel){
                ButterFlyModel s = (ButterFlyModel) animal;
                if(s.getFlyBehavior() instanceof CanFly )
                    countFly++;
                if(s.getWalkBehavior() instanceof CanWalk )
                    countWalk++;
                if(s.getSingBehavior() instanceof CanSing )
                    countSing++;

            } else if(animal instanceof Dolphins){
                    countSwim++;
            }

        }
        System.out.format("Fly %d, Swim %d, Walk %d, Sing %d",countFly,countSwim, countWalk, countSing);
    }
}
