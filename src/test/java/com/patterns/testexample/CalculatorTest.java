package com.patterns.testexample;


import com.patterns.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5,5));
    }

    @Test
    void sumTest(){
        Calculator calc = new Calculator();
        assertEquals(9, calc.sum(4,5));

    }


    @Test
    void subTest(){
        Calculator calc = new Calculator();
        assertEquals(10, calc.rest(20,10));
    }
}