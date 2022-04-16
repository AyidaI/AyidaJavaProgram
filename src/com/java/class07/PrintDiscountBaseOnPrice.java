package com.java.class07;
//Take a price from user and print discount value based on price
//less than 100 then print - No Discount
//less than 500 then print - 5%
//less than 1000 then print - 10%
//more than or equal 1000 then print -15%
import java.util.Scanner;

public class PrintDiscountBaseOnPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        int price = sc.nextInt();
        System.out.println("Your discount is");

        if (price < 100) {
            System.out.println("No Discount");
        } else if (price < 500) {
            System.out.println("5%");
        } else if (price < 1000) {
            System.out.println("10%");
        } else if (price >= 1000) {
            System.out.println("15%");

        } else

            System.out.println("Print discount value");
    }
}


