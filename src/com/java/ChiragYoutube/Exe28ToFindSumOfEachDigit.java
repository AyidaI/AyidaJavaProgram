package com.java.ChiragYoutube;
//rogram To Find Sum Of Each Digit Of Given Number | Java While Loop
public class Exe28ToFindSumOfEachDigit {
    public static void main(String[] args) {
        int num=34535, sum=0;

        while(num>0){
           sum=sum+ (num%10);
            num=num/10;
        }
        System.out.println(sum);
    }
}
