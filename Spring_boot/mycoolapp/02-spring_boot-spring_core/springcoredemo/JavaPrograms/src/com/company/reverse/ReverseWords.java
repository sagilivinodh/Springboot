package com.company.reverse;

public class ReverseWords {

    public static String reverseWords(String str) {
       String[] words = str.split(" ");
       String result = "";

       for(int i=words.length-1;i >= 0;i--) {
           if(i ==0) {
               result = result + words[i];
           } else {
               result = result + words[i] + " ";
           }
       }
       return result;
    }

    public static void main(String[] args) {
        String str = "Vinodh is very good boy";

        System.out.println(reverseWords(str));
    }
}
