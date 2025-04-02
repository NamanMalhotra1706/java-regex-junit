package com.brigelabz.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String [] programmingLanguage = {"Java", "Python", "JavaScript", "Go", "React", "", "C"};

        String regex = "\\b("+String.join("|",programmingLanguage)+")\\b";

        Pattern languagePattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Matcher matchPattern = languagePattern.matcher(text) ;

        while(matchPattern.find()){
            System.out.print(matchPattern.group()+" ");
        }
    }
}
