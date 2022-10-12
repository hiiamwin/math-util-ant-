package com.thang.mathutil.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.thang.mathutil.core.MathUtil.*;

/**
 *
 * @author thangbv
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDDTTest {

    /**
     * chuẩn bị data, mảng 2 chiều vì nó có n đưa vào và expected [2] và có
     * nhiều cặp như thế [7]ư mảng 2 chiều [7][2]
     */
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}
        };
        return new Integer[][]{{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}
        };
    }   //xài warper class nếu chơi với số

    // sau khi có bộ data qua mảng 2 chiều thì JUNIT thì sẽ tự loop để lôi ra từng cặp 
    //data (1,0) (1,1) (2,2), (6,3)...
    // nhồi cặp này vào trong hàm so sánh 
    /**
     * nhồi bằng cách gán vào biến nào đó gán vào biến là tham số hóa
     * parameterized ta sẽ map/ánh xạ 2 cột ứng với 2 biến: cột 0-EXPECTED cột
     * 1-N đưa vào hàm GETF()
     */
    @Parameterized.Parameter(value = 0)
    public long expected;
    @Parameterized.Parameter(value = 1)
    public int n;
    /**
     * test vì đã có data
     */
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected,getFactorial(n));
        
    }
}
/**
 * class này sẽ chứa code để test hàm GetFactorial(), coi hàm chạy đúng không
 * dùng code viết ra để test các class khác hoặc các code khác thì code này hoặc
 * class này gọi là test script Trong test script sẽ có những tình huống xài app
 * để xử lý kết quả có như lỳ vọng không 1 test script sẽ có nhiều testcase mỗi
 * testcase sẽ ứng với 1 tính huống xài hàm
 *
 * phân tích test script cũ: trong test script cũ xuất hiện bad smell(sự trùng
 * lặp về câu lệnh) lệnh so sánh giá trị, lệnh gọi hàm đc lặp đi lặp lại với mỗi
 * testcase
 *
 *
 * có cách nào kiểu thay 2 con số trong lệnh so sánh =2 ??? nào đó nếu ta tách
 * đc toàn bộ data trong bộ so sánh ở trên ra 1 chỗ riếng biệt sau đó ta chỉ
 * việc pick/lấy/tỉa data này xong nạp dần vào lệnh gọi hàm thì ta sẽ đạt đc:
 * -code gon gàn hơn không bị rùng lặp - nhìn tổng quan có bao nhiêu testcase và
 * liệu rằng chúng có đủ hay chưa kỹ thuật viết test script mà tách biệt data ra
 * khỏi lệnh so sánh đc gọi bằng: PARAMETERIZED: tham số hóa data, biến data ra
 * 1 chỗ đặt cho chúng cái tên biến để nhồi vào hàm so sánh - DDT-DATA DRIVEN
 * TESTING viết code kiểm thử theo style tách data JNUIT TEST hỗ trợ ta tách
 * data, duyệt vòng for trên data nhồi vào hàm tương ứng
 */
