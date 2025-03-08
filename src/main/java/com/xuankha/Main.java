package com.xuankha;

import com.xuankha.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg1RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenWrongArgMinus2ThrowSException();

    }

    // CODE CÁC TEST CASE ĐỂ TEST HÀM CHẠY ĐÚNG HAY SAI - THƯC HÀNH TDD
    // HÀM NÀY ỨNG VỚI 1 TEST CASE, VỚI N = 0 HÀM TRẢ VỀ NGON
    // TÊN HÀM MANG Ý NGHĨA TEST CASE LUÔN, ĐẺ GIÚP DÂN DEV KIỂM TRA TÍNH THIẾU ĐỦ CÁC TEST CASE
    // -> TRÁNH NGHICHJ LÝ THUỐC TRỪ SÂU

    public static void testFactorialGivenRightArg0RunsWell(){
        int n = 0; // cho n  = 0
        long expectedResult = 1; // hy vong 0!  ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n);// thực tế là mấy
        // so sánh giữa expected vs actual
        System.out.println("Expected : " + expectedResult + ",Actual : " + actualValue);
        System.out.println("status : " + (expectedResult == actualValue));
    }

    public static void testFactorialGivenRightArg1RunsWell(){
        int n = 1; // cho n  = 0
        long expectedResult = 1; // hy vong 0!  ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n);// thực tế là mấy
        // so sánh giữa expected vs actual
        System.out.println("Expected : " + expectedResult + ",Actual : " + actualValue);
        System.out.println("status : " + (expectedResult == actualValue));
    }

    public static void testFactorialGivenRightArg5RunsWell(){
        int n = 5; // cho n  = 0
        long expectedResult = 120; // hy vong 0!  ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n);// thực tế là mấy
        // so sánh giữa expected vs actual
        System.out.println("Expected : " + expectedResult + ",Actual : " + actualValue);
        System.out.println("status : " + (expectedResult == actualValue));
    }
    // test giai thua voi am 2
    public static void testFactorialGivenWrongArgMinus2ThrowSException(){
        MathUtility.getFactorial(-2);
    }
}