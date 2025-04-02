package com.brigelabz.advancedproblems;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test";

        String regex = "\\w+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> set = new HashSet<>();
        while(matcher.find()){
            if(set.contains(matcher.group())){
                System.out.println(matcher.group());
            }
            else{
                set.add(matcher.group());
            }
        }
    }
}
