package com.nghialnt.mathutil.core;


// ta tạo bộ thư viện cung cấp các bộ tiện ích liên quan toán học
// vì là đồ tiện ích dùng chung nên hàm sẽ là static
public class MathUtility {
    // hàm tính giai thừa n! = 1.2.3.4......
    // ko tính giai thừa âm
    // 0! = 1
    // vì giai thừa là hàm tăng rất nhanh nên 20! là vừa đủ kiểu long (18 số 0)
    // bài này ko chơi với 21!
    public static long getFactorial (int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid number. n must be between 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1; //0! là 1
        }
            // sống sót đến chỗ này, n = 2 3 4 5...
            // vòng for nhân dồn - nguyên lý con heo đất
            long result = 1; // tích ban đầu = 1
            for (int i = 2; i <= n; i++) {
                result *= i;
            }


        return result;
    }

}

