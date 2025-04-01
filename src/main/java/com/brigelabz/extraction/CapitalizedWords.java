package com.brigelabz.extraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "[A-Z]\\w+";
        Pattern pattern = Pattern.compile(regex);

        Matcher captizeMatcher = pattern.matcher(text);

        while(captizeMatcher.find()){
            System.out.print(captizeMatcher.group()+", ");
        }
    }
}
