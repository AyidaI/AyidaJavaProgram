package com.java.Homework;
//find out result of below
//1*2*3*4*5 =
public class ForLoopFactorial12 {
    public static void main(String[] args) {
        int frac = 1;

        for (int i = 1; i <= 5; i++) {
            frac = frac * i;
        }

        System.out.println(frac);
    }
}

