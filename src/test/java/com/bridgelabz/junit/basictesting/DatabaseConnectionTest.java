package com.bridgelabz.junit.basictesting;

import com.bridgelabz.junit.basic.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    @BeforeEach
    public void databaseConnection() throws Exception{
        DatabaseConnection.connectDatabase();
    }

    @Test
    public void TestCase1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void TestCase2(){
        System.out.println("Test Case 2");
    }

    @Test
    public void TestCase3(){
        System.out.println("Test Case 3");
    }




    @AfterEach
    public void databaseDisconnection(){
        DatabaseConnection.disconnectDatabase();
    }
}
