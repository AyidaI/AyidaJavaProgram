package com.java.class11WhileLoop;
//10 1 9 2 8 3 7 4 6 5
import java.util.Scanner;

public class WhileLoopTester2 {
    public static void main(String[] args) {
        System.out.println("Enter enter how many numbers we need to print");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;

        while (i <= limit/2) {

                System.out.println(11-i);  // for even numbers
            System.out.println(i);
                i++;
            }
        }
    }
