package com.singtel.design.problem.impl;

import com.singtel.design.problem.CanNotFly;
import com.singtel.design.problem.IFlyBehavior;
import org.junit.Assert;
import org.junit.Test;

public class CanNotFlyImplTest {

    private CanNotFly fly = new CanNotFlyImpl();
    @Test
    public void testCanNotFlyImplemtation(){

        Assert.assertTrue(fly instanceof IFlyBehavior);
    }
}