package com.java.class08;
import java.util.Scanner;
//Take three from users and print maximum number out of three numbers

public class MaximumOutThreeNumbers {
    public static void main(String[] args) {
      //Input
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        //output
        System.out.println("Take three numbers and print maximum number.");
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is greater");

        } else {
            if (num2 >num3) {
                System.out.println(num2 + "is greater");
            } else {

                System.out.println(num3 + "is greater");
            }
        }
    }
}
