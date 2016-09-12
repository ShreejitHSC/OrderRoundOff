package com.myproject.exercise.utils;

import org.apache.log4j.Logger;

/**
 * Created by skakk2 on 9/10/2016.
 */
public class RoundOfOrder {
    static final Logger logger = Logger.getLogger(RoundOfOrder.class);

    public String convertToText(String arg) throws Exception {
        try {
            Integer intValueOfInput = Integer.parseInt(arg);
            if (String.valueOf(intValueOfInput).length() > 8) {
                logger.error("The program cannot take values more than 8 digits");
                throw new Exception("More than 8 digit values");
            } else {
                return getTextValues(intValueOfInput);
            }
        } catch (NumberFormatException ne) {
            logger.error("The provided input cannot be convert to an Integer value");
            throw new NumberFormatException();
        }
    }

    private String getTextValues(Integer intValueOfInput) {
        String txtValueOfInteger = "Zero";
        int charLength = String.valueOf(intValueOfInput).length();

        if (charLength == 1 && !intValueOfInput.equals(0)) {
            txtValueOfInteger = valueBelowTwenty(intValueOfInput);
        } else if (charLength == 2) {
            txtValueOfInteger = valueBelowHundred(intValueOfInput);
        } else if (charLength == 3) {
            txtValueOfInteger = valueBelowThousand(intValueOfInput);
        }/*else if (charLength == 4){
            txtValueOfInteger = valueBelowTenThousand(intValueOfInput);
        }else if (charLength == 5){
            txtValueOfInteger = valueBelowLac(intValueOfInput);
        }else if (charLength == 6){
            txtValueOfInteger = valueBelowTenLac(intValueOfInput);
        }else if (charLength == 7){
            txtValueOfInteger = valueBelowCrore(intValueOfInput);
        }else if (charLength == 8){
            txtValueOfInteger = valueAtCrore(intValueOfInput);
        }*/
        return txtValueOfInteger;
    }

    private String valueBelowThousand(Integer intValueOfInput) {
        if ((intValueOfInput % 100) < 20) {
            return valueBelowTwenty(intValueOfInput / 100) + "Hundred " + valueBelowTwenty(intValueOfInput % 100);
        } else {
            return valueBelowTwenty(intValueOfInput / 100) + "Hundred " + valueBelowHundred(intValueOfInput % 100);
        }
    }

    private String valueBelowHundred(Integer intValueOfInput) {
        if (intValueOfInput < 20) {
            return valueBelowTwenty(intValueOfInput);
        } else {
            return tenthValues(intValueOfInput / 10) + valueBelowTwenty(intValueOfInput % 10);
        }
    }

    private String valueBelowTwenty(Integer intValueOfInput) {
        switch (intValueOfInput) {
            case 1:
                return "One ";
            case 2:
                return "Two ";
            case 3:
                return "Three ";
            case 4:
                return "Four ";
            case 5:
                return "Five ";
            case 6:
                return "Six ";
            case 7:
                return "Seven ";
            case 8:
                return "Eight ";
            case 9:
                return "Nine ";
            case 10:
                return "Ten ";
            case 11:
                return "Eleven ";
            case 12:
                return "Twelve ";
            case 13:
                return "Thirteen ";
            case 14:
                return "Fourteen ";
            case 15:
                return "Fifteen ";
            case 16:
                return "Sixteen ";
            case 17:
                return "Seventeen ";
            case 18:
                return "Eighteen ";
            case 19:
                return "Nineteen ";
        }
        return "";
    }

    private String tenthValues(Integer intValueOfInput) {
        switch (intValueOfInput) {
            case 2:
                return "Twenty ";
            case 3:
                return "Thirty ";
            case 4:
                return "Forty ";
            case 5:
                return "Fifty ";
            case 6:
                return "Sixty ";
            case 7:
                return "Seventy ";
            case 8:
                return "Eighty ";
            case 9:
                return "Ninety ";
        }
        return "";
    }
}
