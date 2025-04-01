package com.brigelabz.extraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "\\b(?:https?://|www\\.)[a-zA-Z0-9.-]+(?:\\.[a-zA-Z]{2,})+(?:/[^\\s]*)?\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher linkMatcher = pattern.matcher(text);

        while(linkMatcher.find()){
            System.out.println(linkMatcher.group());
        }
    }
}
