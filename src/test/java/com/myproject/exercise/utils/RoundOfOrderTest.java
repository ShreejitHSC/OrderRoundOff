package com.myproject.exercise.utils;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

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

    @Test
    public void testValueLesserThanTen() throws Exception {
        String testValue = "5";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Five ");
    }

    @Test
    public void testValueLesserThanTwenty() throws Exception {
        String testValue = "15";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Fifteen ");
    }

}
