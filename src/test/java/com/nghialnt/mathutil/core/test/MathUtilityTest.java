package com.nghialnt.mathutil.core.test;

import static com.nghialnt.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {





    // TEST CASE 3: check getFactorial () with n = -5 ... to see the expection
    // tôi muốn thấy có ngoại lệ xuất hiện trong tình huống n âm or n > 20
    // ngoại lệ có xuất hiện như dự kiến hay ko... nếu có thì phải là màu XANH
    // KĨ: CÓ NGOẠI LỆ, NHƯNG L MÀU XANH, VÌ NGOẠI LỆ XUẤT HIỆN NHƯ DỰ KIẾN
    @Test
    void testgetFactorialGivenWrongArgumentThrowsException() {
//        getFactorial(-5);
        // HÀM KIỂM TRA NGOẠI LỆ
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(22);});
    }




    //TEST CASE 2: check getFactorial with n = 5.... to see result of 120
    @Test
    void testFactorialGivenRightArgument5RunWell() {
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));


    }



    // cấu trúc test case: id, description, steps, expected, actual, status (pass or failed), test date,
    //                                                            bug id ( lưu ở bug DB) và lưu ở jira
    //TEST CASE 1: check getFactorial with n = 0 to see result of 1
    //

    @Test
    void testFactorialGivenRightArgument0RunWell() {

        long expectedValue = 1; //hy vọng trả về 1
        long actualValue = getFactorial(0);
        //so sánh
        // truyền thống: sout() để in kết quả và nhìn bằng mắt để đoán đúng sai
        // hiện đại: xài thêm tool, thư viện, unit testing framework JUnit giúp đôi mắt nhìn kết quả đúng sai qua 2 màu
        //xanh và đỏ
        // Não và mắt ko cần nhìn, đoán và kết luận như truyền thống
        // mà thấy đỏ => tạch, xanh => ổn

        assertEquals(expectedValue, actualValue); // hàm của thư viện
        // giống nhau ---> xanh
        // lệch nhau ----> đỏ ----> hàm chạy kq ko như mong đợi

    }
}

// quy tắc xanh đỏ của unit test tool/framework
// nếu tất cả các test case passed (expected = actual) ---> xanh
// nếu chỉ cần 1 trong những test case failed (expected != actual) ------> đỏ
// lý do: hàm đã đúng thì phải đúng hết với các test case đã đưa ra
// mắt chỉ nhìn tín hiệu: xanh đỏ theo style gộp các kết quả
// xanh: đúng hết, đỏ: 1 thằng nào chết -----> bỏ hàm, fix lại
// kĩ thuật viết code chính (hàm trong api, core ...)
// mà đi kèm code test hàm luôn, dùng 2 trạng thái xanh đỏ
// liên tục code xong chạy xanh đỏ, sửa lại, chạy xanh đỏ, tối ưu chỉnh code, chạy lại xanh, đỏ
// xanh đỏ liên tục trong quá trình viết code đc gọi là TDD
// Test driven development - viết code song hành cùng code test (TDD)