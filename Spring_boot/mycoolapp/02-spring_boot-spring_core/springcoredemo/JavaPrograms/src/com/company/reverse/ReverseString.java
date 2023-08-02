package com.company.reverse;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello How are you bro";
        System.out.println(reverseString(str));
        System.out.println(reverseWords(str));
        System.out.println(reverseWords(reverseWords(str)));

    }

    public static String  reverseString(String str) {
        String result = "";
        for(int i=str.length()-1;i>=0;i--) {
            result = result + str.charAt(i);
        }
        return result;
    }


    public static String reverseWords(String str) {
        String[] strWords = str.split(" ");
        String result = "";
       for(int i=strWords.length-1;i>=0;i--) {
           if(i==0) {
               result = result + strWords[i];
           } else {
               result = result + strWords[i] + " ";
           }
       }
       return result;
    }
}
