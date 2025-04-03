package com.bridgelabz.junit.basictesting;

import com.bridgelabz.junit.basic.LongTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class LongTaskTest {

    @Test
    @Timeout(2)
    public void longTaskTimeTest() throws Exception{
        LongTask.longRunningTask();
    }
}
