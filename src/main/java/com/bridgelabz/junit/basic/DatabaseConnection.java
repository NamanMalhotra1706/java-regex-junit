package com.bridgelabz.junit.basic;

public class DatabaseConnection {

    public static void connectDatabase() throws Exception{
        System.out.println("Connection to Database");
        Thread.sleep(5000);
        System.out.println("Connected to Database successfully");
    }

    public static void disconnectDatabase(){
        System.out.println("disconnect to Database...");
    }

    public static void main(String[] args) {

    }
}
