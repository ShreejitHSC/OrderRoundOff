package com.myproject.exercise.utils;

import com.myproject.exercise.App;
import org.apache.log4j.Logger;

/**
 * Created by skakk2 on 9/10/2016.
 */
public class RoundOfOrder {
    static final Logger logger = Logger.getLogger(RoundOfOrder.class);

    public void convertToText(String arg) throws Exception {
        try{
            Integer intValueOfInput = Integer.parseInt(arg);
            if(String.valueOf(intValueOfInput).length() > 8){
                logger.error("The program cannot take values more than 8 digits");
                throw new Exception("More than 8 digit values");
            }else{
                
            }
        } catch (NumberFormatException ne){
            logger.error("The provided input cannot be convert to an Integer value");
            throw new NumberFormatException();
        }
    }


}
