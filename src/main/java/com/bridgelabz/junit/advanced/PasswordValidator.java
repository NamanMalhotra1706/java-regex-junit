package com.bridgelabz.junit.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean validatePassword(String password){
        String regex = "^(?=.*[A-Za-z0-9])(?=.*[#$%^&@]).{8,}$";

        Pattern passPattern = Pattern.compile(regex);
        Matcher matchPassword = passPattern.matcher(password);

        if(matchPassword.matches()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
