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
    public void testValueZero() throws Exception {
        String testValue = "0";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Zero");
    }

    @Test
    public void testValueFive() throws Exception {
        String testValue = "5";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Five ");
    }

    @Test
    public void testValueNine() throws Exception {
        String testValue = "9";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Nine ");
    }

    @Test
    public void testValueEleven() throws Exception {
        String testValue = "11";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Eleven ");
    }

    @Test
    public void testValueNineteen() throws Exception {
        String testValue = "19";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Nineteen ");
    }

    @Test
    public void testValueTwenty() throws Exception {
        String testValue = "20";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Twenty ");
    }

    @Test
    public void testValueTwentyOne() throws Exception {
        String testValue = "21";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Twenty One ");
    }

    @Test
    public void testValueThirtyOne() throws Exception {
        String testValue = "31";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Thirty One ");
    }

    @Test
    public void testValueThirtyNine() throws Exception {
        String testValue = "39";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Thirty Nine ");
    }

    @Test
    public void testValueFortyTwo() throws Exception {
        String testValue = "42";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Forty Two ");
    }

    @Test
    public void testValueFiftyThree() throws Exception {
        String testValue = "53";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Fifty Three ");
    }

    @Test
    public void testValueSixtyFour() throws Exception {
        String testValue = "64";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Sixty Four ");
    }

    @Test
    public void testValueSeventyFive() throws Exception {
        String testValue = "75";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Seventy Five ");
    }

    @Test
    public void testValueEightySix() throws Exception {
        String testValue = "86";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Eighty Six ");
    }

    @Test
    public void testValueNintyNine() throws Exception {
        String testValue = "99";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Ninty Nine ");
    }

}
