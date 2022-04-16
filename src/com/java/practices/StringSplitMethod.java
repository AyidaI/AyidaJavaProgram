package com.java.practices;
//demonstrate working of split(regax, limit) with small limit

public class StringSplitMethod {
    public static void main(String[] args) {
        String str = "geekss@for@geekss";
        String[] arrOfstr = str.split("@", 2);
        for (String a : arrOfstr) {
            System.out.println(a);

            //with high limit
            String str1 = "geekss@for@geekss";
            String[] arrOfstr1 = str1.split("@", 5);
            for (String b : arrOfstr) {
                System.out.println(a);
            }
        }
    }}
