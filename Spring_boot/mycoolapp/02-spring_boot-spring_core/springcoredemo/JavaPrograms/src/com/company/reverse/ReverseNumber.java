package com.company.reverse;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scanner.nextInt();

        //1. using algorithm

        int var = 0;
        while (num !=0) {
            var = var*10 + num%10;
            num= num/10;
        }
        System.out.println("Reverse Number is : " + var);
    }
}
