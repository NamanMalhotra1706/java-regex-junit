package com.bridgelabz.junit.advancedtesting;

import com.bridgelabz.junit.advanced.PasswordValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void validatePasswordTest(){
        boolean isValid = PasswordValidator.validatePassword("Naman@2003");
        Assertions.assertTrue(isValid);
    }
}
