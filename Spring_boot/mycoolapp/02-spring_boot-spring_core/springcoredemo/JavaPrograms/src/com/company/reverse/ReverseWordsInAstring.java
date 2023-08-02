package com.company.reverse;

public class ReverseWordsInAstring {
    public static void main(String[] args) {
        String str = "Vinodh is Good Fellow";

        String[] words = str.split(" ");
        String reverseString = "";


        for(String w:words) {
            String reverseWords="";
            for(int i=w.length()-1;i>=0;i--) {
                reverseWords = reverseWords + w.charAt(i);
            }

            reverseString = reverseString + reverseWords + " ";
        }

        String[] allWords = reverseString.split(" ");
        String result="";
        for(int j=allWords.length-1;j>=0;j--) {
            if(j==0) {
                result = result + allWords[j];
            } else {
                result = result + allWords[j] + " ";
            }
        }
        System.out.println(result);
    }
}
