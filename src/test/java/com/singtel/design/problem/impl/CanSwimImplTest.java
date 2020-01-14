package com.singtel.design.problem.impl;

import com.singtel.design.problem.CanSwim;
import com.singtel.design.problem.ISwimBehavior;
import org.junit.Assert;
import org.junit.Test;

public class CanSwimImplTest {

    private CanSwim swim = new CanSwimImpl();
    @Test
    public void testCanSwimImplemtation(){

        Assert.assertTrue(swim instanceof ISwimBehavior);
    }
}