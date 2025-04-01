package com.brigelabz.extraction;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractDates {
    public static void main(String[] args) {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        String tarekh = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020";

        Pattern pattern = Pattern.compile(regex);
        Matcher matchTarekh = pattern.matcher(tarekh);

        while(matchTarekh.find()){
            System.out.println(matchTarekh.group());
        }
    }
}
