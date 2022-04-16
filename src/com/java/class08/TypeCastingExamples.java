package com.java.class08;

public class TypeCastingExamples {
    public static void main(String[] args) {
       //Type Conversion - Int to Double
        //Wideening type casting
        //implicit type casting = java will do itself without error
        int a=10;
       double d=a;
        System.out.println(d);

//Type Conversion -Doble to Int
        //Narowing type casting
        //Explicit Type Casting = User has to put target data type in bracket
        double dd=10.9;
        int aa= (int)dd;

        System.out.println(aa);
    }
}


