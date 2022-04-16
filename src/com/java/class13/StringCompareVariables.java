package com.java.class13;

import java.util.Scanner;

public class StringCompareVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String book1 = "Love story";
        String book2 = "Love story";
        String book3 = new String("Love story");

        if (book1 == book2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (book2 == book3) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
        if (book1.equals(book3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

