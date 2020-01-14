package com.singtel.design.problem.impl;

import com.singtel.design.problem.CanWalk;
import com.singtel.design.problem.IWalkBehavior;
import org.junit.Assert;
import org.junit.Test;

public class CanWalkImplTest {

    private CanWalk walk = new CanWalkImpl();
    @Test
    public void testCanWalkImplemtation(){

        Assert.assertTrue(walk instanceof IWalkBehavior);
    }
}