package com.bridgelabz.junit.basic;

public class EvenNumber {

    public static boolean isEven(int number){
        return number%2==0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(16));
    }
}
