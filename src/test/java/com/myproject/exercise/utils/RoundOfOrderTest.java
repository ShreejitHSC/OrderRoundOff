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
        roundOfOrder.convertToText("555555555");
    }

    @Test
    public void testValueZero() throws Exception {
        assertThat(roundOfOrder.convertToText("0")).isEqualToIgnoringCase("Zero");
    }

    @Test
    public void testValueFive() throws Exception {
        assertThat(roundOfOrder.convertToText("5")).isEqualToIgnoringCase("Five ");
    }

    @Test
    public void testValueNine() throws Exception {
        assertThat(roundOfOrder.convertToText("9")).isEqualToIgnoringCase("Nine ");
    }

    @Test
    public void testValueEleven() throws Exception {
        assertThat(roundOfOrder.convertToText("11")).isEqualToIgnoringCase("Eleven ");
    }

    @Test
    public void testValueNineteen() throws Exception {
        assertThat(roundOfOrder.convertToText("19")).isEqualToIgnoringCase("Nineteen ");
    }

    @Test
    public void testValueTwenty() throws Exception {
        assertThat(roundOfOrder.convertToText("20")).isEqualToIgnoringCase("Twenty ");
    }

    @Test
    public void testValueTwentyOne() throws Exception {
        assertThat(roundOfOrder.convertToText("21")).isEqualToIgnoringCase("Twenty One ");
    }

    @Test
    public void testValueThirtyOne() throws Exception {
        assertThat(roundOfOrder.convertToText("31")).isEqualToIgnoringCase("Thirty One ");
    }

    @Test
    public void testValueThirtyNine() throws Exception {
        assertThat(roundOfOrder.convertToText("39")).isEqualToIgnoringCase("Thirty Nine ");
    }

    @Test
    public void testValueFortyTwo() throws Exception {
        assertThat(roundOfOrder.convertToText("42")).isEqualToIgnoringCase("Forty Two ");
    }

    @Test
    public void testValueFiftyThree() throws Exception {
        assertThat(roundOfOrder.convertToText("53")).isEqualToIgnoringCase("Fifty Three ");
    }

    @Test
    public void testValueSixtyFour() throws Exception {
        assertThat(roundOfOrder.convertToText("64")).isEqualToIgnoringCase("Sixty Four ");
    }

    @Test
    public void testValueSeventyFive() throws Exception {
        assertThat(roundOfOrder.convertToText("75")).isEqualToIgnoringCase("Seventy Five ");
    }

    @Test
    public void testValueEightySix() throws Exception {
        assertThat(roundOfOrder.convertToText("86")).isEqualToIgnoringCase("Eighty Six ");
    }

    @Test
    public void testValueNintyNine() throws Exception {
        assertThat(roundOfOrder.convertToText("99")).isEqualToIgnoringCase("Ninety Nine ");
    }

    @Test
    public void testValueOneHundred() throws Exception {
        assertThat(roundOfOrder.convertToText("100")).isEqualToIgnoringCase("One Hundred ");
    }

    @Test
    public void testValueTwoHundredOne() throws Exception {
        assertThat(roundOfOrder.convertToText("201")).isEqualToIgnoringCase("Two Hundred One ");
    }

    @Test
    public void testValueTwoHundredEleven() throws Exception {
        assertThat(roundOfOrder.convertToText("211")).isEqualToIgnoringCase("Two Hundred Eleven ");
    }

    @Test
    public void testValueTwoHundredTwenty() throws Exception {
        assertThat(roundOfOrder.convertToText("220")).isEqualToIgnoringCase("Two Hundred Twenty ");
    }

    @Test
    public void testValueTwoHundredTwentyFive() throws Exception {
        assertThat(roundOfOrder.convertToText("225")).isEqualToIgnoringCase("Two Hundred Twenty Five ");
    }

    @Test
    public void testValueThreeHundredThirtyEight() throws Exception {
        assertThat(roundOfOrder.convertToText("338")).isEqualToIgnoringCase("Three Hundred Thirty Eight ");
    }

    @Test
    public void testValueFourHundredFortySix() throws Exception {
        assertThat(roundOfOrder.convertToText("446")).isEqualToIgnoringCase("Four Hundred Forty Six ");
    }

    @Test
    public void testValueNineHundredNinetyNine() throws Exception {
        assertThat(roundOfOrder.convertToText("999")).isEqualToIgnoringCase("Nine Hundred Ninety Nine ");
    }

    @Test
    public void testValueOneThousand() throws Exception {
        assertThat(roundOfOrder.convertToText("1000")).isEqualToIgnoringCase("One Thousand ");
    }

    @Test
    public void testValueOneThousandNine() throws Exception {
        assertThat(roundOfOrder.convertToText("1009")).isEqualToIgnoringCase("One Thousand Nine ");
    }

    @Test
    public void testValueOneThousandEleven() throws Exception {
        assertThat(roundOfOrder.convertToText("1011")).isEqualToIgnoringCase("One Thousand Eleven ");
    }

    @Test
    public void testValueOneThousandTwentyOne() throws Exception {
        assertThat(roundOfOrder.convertToText("1021")).isEqualToIgnoringCase("One Thousand Twenty One ");
    }

    @Test
    public void testValueOneThousandThirtyThree() throws Exception {
        assertThat(roundOfOrder.convertToText("1033")).isEqualToIgnoringCase("One Thousand Thirty Three ");
    }

    @Test
    public void testValueOneThousandOneHunderdOne() throws Exception {
        assertThat(roundOfOrder.convertToText("1101")).isEqualToIgnoringCase("One Thousand One Hundred One ");
    }

    @Test
    public void testValueOneThousandOneHunderdEleven() throws Exception {
        assertThat(roundOfOrder.convertToText("1111")).isEqualToIgnoringCase("One Thousand One Hundred Eleven ");
    }

    @Test
    public void testValueOneThousandOneHunderdTwentyOne() throws Exception {
        assertThat(roundOfOrder.convertToText("1121")).isEqualToIgnoringCase("One Thousand One Hundred Twenty One ");
    }

    @Test
    public void testValueOneThousandOneHunderdNinetyNine() throws Exception {
        assertThat(roundOfOrder.convertToText("1199")).isEqualToIgnoringCase("One Thousand One Hundred Ninety Nine ");
    }

    @Test
    public void testValueOneThousandFourHundredThree() throws Exception {
        assertThat(roundOfOrder.convertToText("1403")).isEqualToIgnoringCase("One Thousand Four Hundred Three ");
    }

    @Test
    public void testValueTwoThousandNineHunderdThityThree() throws Exception {
        assertThat(roundOfOrder.convertToText("2933")).isEqualToIgnoringCase("Two Thousand Nine Hundred Thirty Three ");
    }

    @Test
    public void testValueNineThousandNineHunderdNinetyNine() throws Exception {
        assertThat(roundOfOrder.convertToText("9999")).isEqualToIgnoringCase("Nine Thousand Nine Hundred Ninety Nine ");
    }

    @Test
    public void testValueTenThousand() throws Exception {
        assertThat(roundOfOrder.convertToText("10000")).isEqualToIgnoringCase("Ten Thousand ");
    }

    @Test
    public void testValueTenThousandOne() throws Exception {
        assertThat(roundOfOrder.convertToText("10001")).isEqualToIgnoringCase("Ten Thousand One ");
    }

    @Test
    public void testValueTenThousandEleven() throws Exception {
        assertThat(roundOfOrder.convertToText("10011")).isEqualToIgnoringCase("Ten Thousand Eleven ");
    }

    @Test
    public void testValueTenThousandTwentyOne() throws Exception {
        assertThat(roundOfOrder.convertToText("10021")).isEqualToIgnoringCase("Ten Thousand Twenty One ");
    }

    @Test
    public void testValueTenThousandNinetyNine() throws Exception {
        assertThat(roundOfOrder.convertToText("10099")).isEqualToIgnoringCase("Ten Thousand Ninety Nine ");
    }

    @Test
    public void testValueTenThousandOneHundered() throws Exception {
        assertThat(roundOfOrder.convertToText("10100")).isEqualToIgnoringCase("Ten Thousand One Hundred ");
    }

    @Test
    public void testValueTenThousandOneHunderedOne() throws Exception {
        assertThat(roundOfOrder.convertToText("10101")).isEqualToIgnoringCase("Ten Thousand One Hundred One ");
    }

    @Test
    public void testValueTenThousandOneHunderedTen() throws Exception {
        assertThat(roundOfOrder.convertToText("10110")).isEqualToIgnoringCase("Ten Thousand One Hundred Ten ");
    }

    @Test
    public void testValueTenThousandOneHunderedTwentyOne() throws Exception {
        assertThat(roundOfOrder.convertToText("10121")).isEqualToIgnoringCase("Ten Thousand One Hundred Twenty One ");
    }
}
