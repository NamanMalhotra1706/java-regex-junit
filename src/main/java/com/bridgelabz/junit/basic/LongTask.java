package com.bridgelabz.junit.basic;

public class LongTask {

    public static void longRunningTask() throws Exception{
        long startTime = System.nanoTime();

        System.out.println("Work Start");
        Thread.sleep(5000);
        System.out.println("Work Complete Tooks " + (System.nanoTime()-startTime) +  " ns time");
    }

    public static void main(String[] args) throws Exception {
        longRunningTask();
    }
}
