package com.brigelabz.basicregex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2,2}[0-9]{4,4}" ;
        Pattern pattern = Pattern.compile(regex);

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String plateNumber = br.readLine();
            Matcher matchPlaterNumber = pattern.matcher(plateNumber);

            if(matchPlaterNumber.matches()){
                System.out.println(plateNumber+" is valid.");
            }
            else{
                System.out.println(matchPlaterNumber+" is not valid.");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
