package com.xuankha.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // CHUẨN bị 1 mảng  2 chiều để đưa data vào test
    // hàm này phải rág táttic - nằm 1 chỗ  cod định trong ram để cung cấp data

    public  static Object[][] initData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
    }

    @ParameterizedTest
    @MethodSource("initData")
    public  void testFactorialGivenRightArgRunsWell(int n , long expectedResult){
        assertEquals(expectedResult ,  MathUtility.getFactorial(n));
    }
}