package com.myproject.exercise;

import com.myproject.exercise.utils.RoundOfOrder;
import org.apache.log4j.Logger;

/**
 * Created by skakk2 on 9/10/2016.
 */
public class App {
    static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            RoundOfOrder roundOfOrder = new RoundOfOrder();
            roundOfOrder.convertToText(args[0]);
        }else{
            logger.error("Atleast one argument is needed as an input");
            throw new Exception();
        }
    }
}
