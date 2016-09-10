package com.myproject.exercise;

import org.junit.Test;

/**
 * Created by skakk2 on 9/10/2016.
 */
public class AppTest {

    @Test(expected=Exception.class)
    public void testNumberOfArguments() throws Exception {
        String[] argsList = new String[]{};
        App.main(argsList);
    }
}
