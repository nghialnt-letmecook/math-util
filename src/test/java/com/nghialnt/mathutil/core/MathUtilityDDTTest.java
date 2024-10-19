package com.nghialnt.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {


    // @Test là 1 phần annotation of framework, biến hàm của ta thành hàm main để có thể run
    // hàm bình thường chỉ có th trong main () để chạy
    // @Test biến hàm bất kì thành main


    // Kĩ thuật DDT - DATA DRIVEN TESTING: Kĩ thuật tách bộ data kiểm thử ra khỏi các câu lệnh kiểm thử,
    // mục đích giúp developer nhìn nhanh ược xem bộ test case còn thiếu test case nào hay ko
    // kĩ thuật này còn gọi tên khác là tham số hóa bộ data kiểm thử (PARAMETERIZED TESTING)

    // TA LÀM RIÊNG 1 HÀM, PHẢI LÀ STATIC, ĐỂ LƯU BỘ DATA KIỂM THỬ
    public static Object [] [] initTestData () {
        return new Object [][] {
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
                {6,7200},
        };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentsRunWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    public static Integer[] initTestDataForCheckingException () {
        return new Integer[] {-1, -2, -3, -4, -5, -6, -100, 21, 22, 23, 23, 100} ;
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testFactorialGivenWrongArgumentsRunWell(int n) {
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(n));
    }

}