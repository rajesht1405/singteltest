package com.singtel.design.problem.impl;

import com.singtel.design.problem.CanFly;
import com.singtel.design.problem.IFlyBehavior;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CanFlyImplTest {

    private CanFly fly;
    @Test
    public void testCanFlyImplemtation(){

        Assert.assertTrue(fly instanceof IFlyBehavior);
    }

    @Before
    public void setUp() throws Exception {
        fly= new CanFlyImpl();
    }

    @After
    public void tearDown() throws Exception {
        fly = null;
    }
}