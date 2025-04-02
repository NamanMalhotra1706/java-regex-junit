package com.brigelabz.advancedproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateACreditCard {
    static List<String> cardList = Arrays.asList("visa", "mastercard");
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String card = br.readLine().toLowerCase();
        if(cardList.contains(card)){
            System.out.print("Card Accepted, Please Enter the card Number: ");
            String cardNumber = br.readLine();
            if(isValideCreditCard(card, cardNumber)){
                System.out.println("Valid Card with valid card number");
            }
            else{
                System.out.println("Valid Card with invalid card number");
            }
        }
    }

    public static boolean isValideCreditCard(String card, String cardNumber ){
        String regex;
        if(card.equals("visa")){
          regex = "^4[0-9]{15}$";
        }else{
            regex = "^5[0-9]{15}$";
        }

        Pattern cardPattern = Pattern.compile(regex);
        Matcher matchCard = cardPattern.matcher(cardNumber);

        if(matchCard.matches()){
            return true;
        }
        return false;
    }
}
