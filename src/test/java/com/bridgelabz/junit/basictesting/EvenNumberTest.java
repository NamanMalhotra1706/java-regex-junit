package com.bridgelabz.junit.basictesting;

import com.bridgelabz.junit.basic.EvenNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberTest {
    @ParameterizedTest
    @ValueSource(ints = {2,4,8,10,16,20,7,9})
    public void IsEvenTest(int number){
        Assertions.assertTrue(EvenNumber.isEven(number));
    }
}
