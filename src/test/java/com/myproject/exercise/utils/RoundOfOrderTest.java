package com.myproject.exercise.utils;

import org.junit.Before;
import org.junit.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by skakk2 on 9/10/2016.
 */
public class RoundOfOrderTest {
    RoundOfOrder roundOfOrder;

    @Before
    public void before() {
        roundOfOrder = new RoundOfOrder();
    }

    @Test(expected = NumberFormatException.class)
    public void testCovertForInvalidInput() throws Exception {
        roundOfOrder.convertToText("abcde");
    }

    @Test(expected = Exception.class)
    public void testBiggerIntegerValuesMoreThanEightDigits() throws Exception {
        String biggerValue = "555555555";
        roundOfOrder.convertToText(biggerValue);
    }
}
