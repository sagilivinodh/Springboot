package com.company.swaping;

public class swaping2number {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println("Before swaping : " + a +" " + b);

        // logic 1
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;


        //logic 2 - use + & - without using 3rd variable

//        a = a+b;  // 30
//        b = a-b;  // 10
//        a = a-b;  // 20

        // logic 3 use * & / without using 3rd variable


//        a = a*b; //10*20 = 200
//        b = a/b; //200/20 = 10
//        a = a/b; // 200/10 = 20

        //logic 4 use bitwise XOR(^)

//        a = a^b;
//        b = a^b;
//        a = a^b;

        //logic 5 - single statement
        b = a+b-(a=b);
        System.out.println("After swaping : " + a +" " + b);
    }
}
