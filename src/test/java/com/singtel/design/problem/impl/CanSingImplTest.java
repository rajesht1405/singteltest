package com.singtel.design.problem.impl;

import com.singtel.design.problem.CanSing;
import com.singtel.design.problem.ISingBehavior;
import org.junit.Assert;
import org.junit.Test;

public class CanSingImplTest {

    private CanSing sing = new CanSingImpl();
    @Test
    public void testCanSingImplemtation(){

        Assert.assertTrue(sing instanceof ISingBehavior);
    }

}