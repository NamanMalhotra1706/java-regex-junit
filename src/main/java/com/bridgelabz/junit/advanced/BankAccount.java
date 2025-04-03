package com.bridgelabz.junit.advanced;


public class BankAccount {

    public static class InsufficientBalanceException extends RuntimeException{
        public InsufficientBalanceException(String errorMessage){
            super(errorMessage);
        }
    }

    private double balance=0;

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance-=amount;

        System.out.println("Current Balance: " + balance);
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {

    }
}
