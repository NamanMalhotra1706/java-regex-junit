package com.brigelabz.basicregex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6,6}";
        Pattern pattern = Pattern.compile(regex);

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String colorCode = br.readLine();
            Matcher matchColorCode = pattern.matcher(colorCode);

            if(matchColorCode.matches()){
                System.out.println(colorCode + " -->  Valid");
            }else{
                System.out.println(colorCode +" --> Invalid");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
