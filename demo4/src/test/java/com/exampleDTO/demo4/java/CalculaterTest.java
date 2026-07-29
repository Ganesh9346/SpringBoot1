package com.exampleDTO.demo4.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculaterTest {
    Calculator calculator=new Calculator();
    @Test
    void testAddition(){
        int result=calculator.add(5,4);
        assertEquals(9,result);
    }

    @Test
    void testSubraction(){
        int result=calculator.sub(10,5);
        assertEquals(5,result);

    }

}
