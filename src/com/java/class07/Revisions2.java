package com.java.class07;

public class Revisions2 {
    public static void main(String[] args) {
        int a = 55;
        if (a % 10 > 6) {  //5>6  false
            System.out.println("1");
        } else if (a % 10 < 6) {   //5<6  true
            System.out.println("2");
        } else if (a % 10 == 5) {    //5==5  true
        } else {
            System.out.println("4");
        }
    }
}
