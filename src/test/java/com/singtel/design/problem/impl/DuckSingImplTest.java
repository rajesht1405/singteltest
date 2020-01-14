package com.singtel.design.problem.impl;

import com.singtel.design.problem.CanSing;
import com.singtel.design.problem.ISingBehavior;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuckSingImplTest {

    private CanSing sing = new DuckSingImpl();
    @Test
    public void testDuckCanSingImplemtation(){

        Assert.assertTrue(sing instanceof ISingBehavior);
    }
}