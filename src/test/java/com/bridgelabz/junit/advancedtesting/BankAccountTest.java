package com.bridgelabz.junit.advancedtesting;

import com.bridgelabz.junit.advanced.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount icici ;

    @BeforeEach
    public void createAccount(){
        icici = new BankAccount();
    }

    @Test
    public void depositTest(){
        icici.deposit(2000);
        double iciciBalance = icici.getBalance();
        double expected = 2000;

        Assertions.assertEquals(expected, iciciBalance, "Deposit failed");
    }

    @Test
    public void withdrawTest() throws Exception {
        icici.deposit(2000);  // Ensure enough balance
        icici.withdraw(2000);
        double iciciBalance = icici.getBalance();
        double expected = 0;

        Assertions.assertEquals(expected, iciciBalance, "Withdrawal failed");
    }

    @Test
    public void insufficientFundsTest() {
        Assertions.assertThrows(BankAccount.InsufficientBalanceException.class, () -> {
            icici.withdraw(500);
        }, "Expected InsufficientBalanceException for withdrawal exceeding balance");
    }
}
