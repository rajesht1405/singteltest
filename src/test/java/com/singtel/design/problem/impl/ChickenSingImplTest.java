package com.singtel.design.problem.impl;

import com.singtel.design.problem.CanSing;
import com.singtel.design.problem.ISingBehavior;
import org.junit.Assert;
import org.junit.Test;

public class ChickenSingImplTest {

    private CanSing sing = new ChickenSingImpl();
    @Test
    public void testCanSingImplemtation(){

        Assert.assertTrue(sing instanceof ISingBehavior);
    }
}