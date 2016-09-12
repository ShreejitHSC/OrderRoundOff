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
        assertThat(retValue).isEqualToIgnoringCase("Ninety Nine ");
    }

    @Test
    public void testValueOneHundred() throws Exception {
        String testValue = "100";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Hundred ");
    }

    @Test
    public void testValueTwoHundredOne() throws Exception {
        String testValue = "201";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Two Hundred One ");
    }

    @Test
    public void testValueTwoHundredEleven() throws Exception {
        String testValue = "211";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Two Hundred Eleven ");
    }

    @Test
    public void testValueTwoHundredTwenty() throws Exception {
        String testValue = "220";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Two Hundred Twenty ");
    }

    @Test
    public void testValueTwoHundredTwentyFive() throws Exception {
        String testValue = "225";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Two Hundred Twenty Five ");
    }

    @Test
    public void testValueThreeHundredThirtyEight() throws Exception {
        String testValue = "338";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Three Hundred Thirty Eight ");
    }

    @Test
    public void testValueFourHundredFortySix() throws Exception {
        String testValue = "446";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Four Hundred Forty Six ");
    }

    @Test
    public void testValueNineHundredNinetyNine() throws Exception {
        String testValue = "999";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Nine Hundred Ninety Nine ");
    }

    @Test
    public void testValueOneThousand() throws Exception {
        String testValue = "1000";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand ");
    }

    @Test
    public void testValueOneThousandNine() throws Exception {
        String testValue = "1009";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand Nine ");
    }

    @Test
    public void testValueOneThousandEleven() throws Exception {
        String testValue = "1011";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand Eleven ");
    }

    @Test
    public void testValueOneThousandTwentyOne() throws Exception {
        String testValue = "1021";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand Twenty One ");
    }

    @Test
    public void testValueOneThousandThirtyThree() throws Exception {
        String testValue = "1033";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand Thirty Three ");
    }

    @Test
    public void testValueOneThousandOneHunderdOne() throws Exception {
        String testValue = "1101";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand One Hundred One ");
    }

    @Test
    public void testValueOneThousandOneHunderdEleven() throws Exception {
        String testValue = "1111";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand One Hundred Eleven ");
    }

    @Test
    public void testValueOneThousandOneHunderdTwentyOne() throws Exception {
        String testValue = "1121";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand One Hundred Twenty One ");
    }

    @Test
    public void testValueOneThousandOneHunderdNinetyNine() throws Exception {
        String testValue = "1199";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand One Hundred Ninety Nine ");
    }

    @Test
    public void testValueOneThousandFourHundredThree() throws Exception {
        String testValue = "1403";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("One Thousand Four Hundred Three ");
    }

    @Test
    public void testValueTwoThousandNineHunderdThityThree() throws Exception {
        String testValue = "2933";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Two Thousand Nine Hundred Thirty Three ");
    }

    @Test
    public void testValueNineThousandNineHunderdNinetyNine() throws Exception {
        String testValue = "9999";
        String retValue = roundOfOrder.convertToText(testValue);
        assertThat(retValue).isEqualToIgnoringCase("Nine Thousand Nine Hundred Ninety Nine ");
    }


}
