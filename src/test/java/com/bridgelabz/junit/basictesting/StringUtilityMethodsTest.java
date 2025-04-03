package com.bridgelabz.junit.basictesting;

import com.bridgelabz.junit.basic.StringUtilityMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilityMethodsTest {

    @Test
    public void toUpperCaseTest(){
        String result = StringUtilityMethods.toUpperCase("naman");
        String expected = "NAMAN";

        Assertions.assertEquals(result,expected);
    }

    @Test
    public void isPalindromeTest(){
        boolean result = StringUtilityMethods.isPalindrome("naman");
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void reverseTest(){
        String result = StringUtilityMethods.reverse("naman Malhotra");
        String expected = "artohlaM naman";

        Assertions.assertEquals(expected,result);
    }

}
