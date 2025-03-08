package com.xuankha.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    @Test
    public  void testFactorialGivenRightArg5RunsWell(){
//        int n = 5; // cho n  = 5
//        long expectedResult = 120; // hy vong 5!  ở trên sẽ là 120
//        long actualValue = MathUtility.getFactorial(n);// thực tế là mấy

        assertEquals(120 ,  MathUtility.getFactorial(5));
    }

    @Test
    public  void testFactorialGivenRightArg0RunsWell(){
        assertEquals(1 ,  MathUtility.getFactorial(0));
    }

    @Test
    public  void testFactorialGivenRightArg1RunsWell(){
        assertEquals(1 ,  MathUtility.getFactorial(1));
    }

    @Test
    public  void testFactorialGivenRightArg2RunsWell(){
        assertEquals(2 ,  MathUtility.getFactorial(2));
    }

    @Test
    public  void testFactorialGivenRightArg4RunsWell(){
        assertEquals(24 ,  MathUtility.getFactorial(4));
    }
}