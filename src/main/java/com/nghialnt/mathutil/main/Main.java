package com.nghialnt.mathutil.main;

import static com.nghialnt.mathutil.core.MathUtility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //testFactorialGivenRightArgument5RunsWell();
        testFactorialGivenWrongArgumentMinus5ThrowsException();
    }



    // các testcase để dưới đây, lát hồi run trong main




    //VỀ LÝ THUYẾT TA PHẢI TEST VỚI DATA n = 2, 3, .... 20






    //test case 4:
    // description: test factorial with invalid argument, ex n = -5
    // steps:
    //      call getFactorial: (-5)
    // expected result:
    //      an expection is thrown - kì vọng 1 ngoại lệ xuất hiện
    // diễn giải thêm: hàm thiết kế rằng nếu đưa n âm -> hàm sẽ chửi
    // vậy nếu test n âm -> chửi -> đúng
    // thấy ngoại lệ mừng rơi nước mắt


    static void testFactorialGivenWrongArgumentMinus5ThrowsException () {

        getFactorial(-5);
    }





// test case 3: tự viết nốt phần mô tả
    static void testFactorialGivenRightArgument5RunsWell (){

//        int n = 1;
//        long expectedValue = 1; //hy vọng 1! = 1
//        long actualValue = MathUtility.getFactorial(n);
        //SO SÁNH BẰNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
        System.out.println("5! expected: 120" + " | actual: " + getFactorial(5));
    }





    //TEST CASE 2: (bộ data đưa vào)
    // Description: check getFactorial method with valid argument (n = 1)
    // steps/procedures: (cách test, các bước verify hàm, chức năng)
    //      call function method with n = 1: getFactorial (1)
    // expected result: ( hy vọng gọi 1! thì giá trị trả veef là mấy)
    //          To have 1 as the result of 1!
    // Status: (pass || fail-bug): phải run hàm mới biết và nhìn kq trả về mới biết hàm chạy đúng hay sai
    //          PASSED !!!!
    // CHẠY TEST CASE ĐỂ XÁC ĐỊNH ĐC HÀM ĐÚNG SAI -> ĐƯỢC GỌI LÀ TEST RUN.
    static void testFactorialGivenRightArgument1RunsWell (){

        int n = 1;
        long expectedValue = 1; //hy vọng 1! = 1
        long actualValue = getFactorial(n);
        //SO SÁNH BẰNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
        System.out.println("1! expected: " + expectedValue + " | actual: " + actualValue);
    }





    static void testFactorialGivenRightArgument0RunsWell (){
        // TEST CASE 1
        // description: check getFactorial Func with valid argument(n=0)
        // Steps:
        //     Call function/method with n = 0 getFactorial (0)
        // expected result:
        //     Get 1 as the result of 0!
        // actual result/Status (pass || failed) waiting for test run

        // TEST RUN: RUN CÁI TESTCASE
        long expectedResult = 1;
        long actualResult = getFactorial(0); //named-argument
        System.out.println("Expected result: " + expectedResult + "| Actual result: " + actualResult);
    }




}