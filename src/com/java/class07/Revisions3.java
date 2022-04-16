package com.java.class07;

public class Revisions3 {
    public static void main(String[] args) {
        int a=19;
        if(a%10*2>10){          //9*2=18>10 true
            System.out.println("1");
        }else if(a%10 - 4 ==5){  //9-4==5 true
            System.out.println("2");
        }
        if(a*2>3){     //19*2>3  true
            System.out.println("3");
        }else{
            System.out.println("4");
        }
    }
}
