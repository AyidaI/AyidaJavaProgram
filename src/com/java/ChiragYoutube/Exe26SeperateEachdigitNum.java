package com.java.ChiragYoutube;
//write a program to separate each digit num
public class Exe26SeperateEachdigitNum {
    public static void main(String[] args) {
        int num=123;

        while(num!=0){
            System.out.println(num%10);
            num=num/10;
        }
    }
}
