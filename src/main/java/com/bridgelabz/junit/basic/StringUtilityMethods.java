package com.bridgelabz.junit.basic;

public class StringUtilityMethods {
    public static String reverse(String str){
        StringBuilder stb = new StringBuilder(str);
        stb.reverse();

        return stb.toString();
    }

    public static boolean isPalindrome(String str){
       int st=0;
       int end = str.length()-1;
       while(st<end){
           if(str.charAt(st)!=str.charAt(end)){
               return false;
           }
           st++;
           end--;
       }
       return true;
    }

    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "naman";
        System.out.println(reverse(str));
        System.out.println(isPalindrome(str));
        System.out.println(toUpperCase(str));
    }
}
