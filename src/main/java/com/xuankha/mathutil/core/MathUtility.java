package com.xuankha.mathutil.core;

public class MathUtility {

    // class này là bộ thư biện chứa các hàm toán học giống class Math trong JDK
    //THư viện chứa hàm tính toàn mà ko cần lưu trữ kết quả
    // chỉ trả về kết quả thì nên được thiêys kế là hàm static
    // ví dụ Math.sqrt() Math.abs()
    // class này là tạm lamf hình tính giai thừ n!

    //n!= 1.2.3.4..n
    //0! = 1
    //20! vừa đủ kiểu long, 21! kiểu long chứa ko nổi , tràn
    // quy ước hàm ày chỉ tính n từ 0 ..20
    // code hàm cững đồng thời kiểm thử hàm , muốn kiểm thử phải có testcase



    public static long getFactorial(int n){
        if ( n < 0 || n > 20){
            // return -1;
            throw new IllegalArgumentException("Invalid n. n must be betwewn 0 to 20");
        }
        if (n == 0 ){
            return 1;
        }
        // khỏi viết else cho code nhìn đẹp
        // n bắt đầu từ 1
        // thuật toán con heo đất, nhân dần , cộng dồn
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i ; // i bị nhân dồn vào resule = result * i
        }
       return result;
    }


    // TEST CASE #1
    //VERIFY GETFACTORIAL() WITH N = 0
    // STEP/PROCEDURE
    //   (1)GIVEN N WITH 0
    //          (2) CALL GETFACTORIAL(N)
    // EXPECTED VALUE/RESULT : THE METHOD WILL RETURN 0


    // TEST CASE #2
    //VERIFY GETFACTORIAL() WITH N = 1
    // STEP/PROCEDURE
    //   (1)GIVEN N WITH 1
    //          (2) CALL GETFACTORIAL(N)
    // EXPECTED VALUE/RESULT : THE METHOD WILL RETURN 1


    // TEST CASE #3
    //VERIFY GETFACTORIAL() WITH N = 5
    // STEP/PROCEDURE
    //   (1)GIVEN N WITH 5
    //          (2) CALL GETFACTORIAL(N)
    // EXPECTED VALUE/RESULT : THE METHOD WILL RETURN 120
}
