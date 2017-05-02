package com.example.tholba.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity main=new MainActivity();
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, main.add(2,2));
    }

    @Test
    public void isValidEmailId(){

    }
}