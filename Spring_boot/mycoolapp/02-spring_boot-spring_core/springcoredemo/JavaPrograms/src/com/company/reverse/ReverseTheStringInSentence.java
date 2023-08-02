package com.company.reverse;


class ReverseThevalueInSentence {

   public static void reverse(char[] str,int start, int end) {
      int temp;
      while (start <= end) {
         temp = str[start];
         str[start] = str[end];
         str[end] = (char) temp;
         start++;
         end--;
      }
   }
   public static char[] reverseString(char[] s) {
      int start = 0;

      for(int end=0; end < s.length;end++) {
         if(s[end] == ' '){
            reverse(s, start, end);
            start = end +1;
         }
      }
      reverse(s, start, s.length-1);
      reverse(s,0,s.length-1);
      return s;
   }

   public static void main(String[] args) {
      String s = "Vinod is good fellow";
      char[] p = reverseString(s.toCharArray());
      System.out.println(p);
   }

}
