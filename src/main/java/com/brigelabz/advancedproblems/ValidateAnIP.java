package com.brigelabz.advancedproblems;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateAnIP {
    public static void main(String[] args) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";

        Pattern ipPattern = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        Matcher matchIP = ipPattern.matcher(userInput);

        if(matchIP.matches()){
            System.out.println("Valid IP4 Address");
        }
        else{
            System.out.println("Not a valid IP4 Address");
        }


    }
}
