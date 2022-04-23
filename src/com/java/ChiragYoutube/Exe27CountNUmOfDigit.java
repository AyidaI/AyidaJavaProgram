package com.java.ChiragYoutube;
//Program To Count Number of Digit In Given Number | Java While Loop

public class Exe27CountNUmOfDigit {
    public static void main(String[] args) {
        int num=12345, count=0;
        while(num>0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
