package com.java.ChiragYoutube;
//write a program to check given num is prime or not
//Prime number -a number that is divisible only 1 and itself
//Example 2 3 5 7 11 13 - those num you can't divide with any number beside 1 and itself

public class Exer22ToCheckGivenNumberIsPrimeOrNot {
    public static void main(String[] args) {
        int num=7, count=0;

        for(int i=1; i<=num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

                if(count==2){
                    System.out.println("prime");
                }else{
                    System.out.println("not prime");
                }
            }
        }


