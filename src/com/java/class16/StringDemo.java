package com.java.class16;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="Hello";

        StringBuffer sBuffer=new StringBuffer("Hello");
        sBuffer.reverse();

        StringBuilder sBuilder=new StringBuilder("Hello");
        sBuilder.reverse();
    }
}
