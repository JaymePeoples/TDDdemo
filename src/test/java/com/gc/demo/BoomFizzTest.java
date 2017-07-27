package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jayme on 7/27/2017.
 */
public class BoomFizzTest {


    @Test
    public void boom() throws Exception {
        BoomFizz boomFizz = new BoomFizz();

        String expected = "1" ;
        String actual = boomFizz.boom(1);
        //assertion
        assertEquals("Your code sucks!", expected, actual);
    }
    @Test
    public void boomTest7() throws Exception{
        BoomFizz boomFizz = new BoomFizz();

        String expected = "Boom" ;
        String actual = boomFizz.boom(473);
        //assertion
        assertEquals("Your code sucks!", expected, actual);

    }

}