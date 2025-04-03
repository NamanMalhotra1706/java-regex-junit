package com.bridgelabz.junit.advancedtesting;

import com.bridgelabz.junit.advanced.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    TemperatureConverter tempConv ;

    @BeforeEach
    public void setup(){
        tempConv = new TemperatureConverter();
    }
    @Test
    public void celsiusToFahrenheitTest(){
        double fahrenheit = tempConv.celsiusToFahrenheit(5);
        double expected = 41;

        Assertions.assertEquals(expected,fahrenheit);
    }

    @Test
    public void fahrenheitToCelsiusTest(){
        double celcius = tempConv.fahrenheitToCelsius(5);
        double expected = -15;

        Assertions.assertEquals(expected,celcius);
    }
}
