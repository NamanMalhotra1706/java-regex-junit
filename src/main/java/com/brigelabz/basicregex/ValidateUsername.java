package com.brigelabz.basicregex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[A-Za-z][a-zA-Z0-9_]{4,14}$" ;
        Pattern pattern = Pattern.compile(regex);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String username = br.readLine();
            Matcher matchWithPattern = pattern.matcher(username);
            if(matchWithPattern.matches()){
                System.out.println("Username is valid: " + username);
            }
            else{
                System.out.println("User name is not valid");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
