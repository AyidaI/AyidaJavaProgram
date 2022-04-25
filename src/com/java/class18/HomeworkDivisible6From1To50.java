package com.java.class18;
//Write a program to print all even numbers which are divisible by 6 from 1 to 50
public class HomeworkDivisible6From1To50 {

    static boolean isDivisible(int num){

            if(num%6==0){
            return true;
        }else{
            return false;
        }}
    public static void main(String[] args) {

        for(int i=1; i<=50; i++){
            if(isDivisible(i)){
            System.out.println(i+" "+"divisible by 6");
        }}}}

