package com.gc.demo;

import java.util.Scanner;

/**
 * Created by jayme on 7/27/2017.
 */
public class BoomFizz {
    private int num = 0;
    private String word = "Boom";
    static Scanner scan = new Scanner(System.in);
    private int num1 = 0;


    public String boom(int num) {
        /* Accepts integer input vales and returns "Boom" if the input number is divisible by 7 or contains
         the digit 7 otherwise returns the input value.
          */
        if (num % 7 == 0) {
            return word;
        } else if (num % 7 != 0) {
            Integer.toString(num).contains("7");
            return word;
        } else {
            System.out.println(num);
        }
        return null;

//
    }
}

