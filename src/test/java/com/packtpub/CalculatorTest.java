package com.packtpub;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Roberto
 * Date: 12/03/13
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorTest {
    @Test
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        sum += 1;
        Assert.assertEquals(4, sum);
    }
    @Test
    public void testBad() throws Exception {
        Assert.fail("Some bad test has failed");
    }
}
