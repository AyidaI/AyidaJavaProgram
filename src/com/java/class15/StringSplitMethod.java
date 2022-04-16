package com.java.class15;
import java.util.Scanner;
public class StringSplitMethod {
    public static void main(String[] args) {


        String str1="Today is sunny day";
        String[] words=str1.split(" ");
        System.out.println(words[0]+words[1]+words[2]+words[3]);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

        System.out.println(words.length);
        for(int i=0; i< words.length; i++){
            System.out.println(words[i]);
        }

    }
}
