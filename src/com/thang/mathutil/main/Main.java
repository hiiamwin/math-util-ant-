/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thang.mathutil.main;

import com.thang.mathutil.core.MathUtil;

/**
 *
 * @author thangbv
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("This message comes from main() method");
        System.out.println("This jar file is built base on ANT co-operating with JUnit");
        System.out.println("More over, this message comes from a US_BUILT JAR FILE");
        tryTDDFirst();
    }

    //ham nay dung de minh hoa cach tdd duoc trien khai nhu the nao
    //viet code song song voi viet test
    //Test      Driven      Development
    //kiem thu  huong ve    viet code
    public static void tryTDDFirst() {
        //test case #1: tinh huong xai ham so 1
        //imput n=0: ta muon tinh 0! coi ham hay ra sao
        //expected =1: ta muon 0! ham tro ve 1!!!
        //thuc te actual=? may,chay thu ham moi biet duoc
        long expected = 1;//minh muon 0! tra ve 1
        long actual = MathUtil.getFactorial(0);
        //kiem thu phan mem la so sanh giua expected va actual de luan dung sai
        System.out.println("0! | Status: " + expected + " | actual:" + actual);

        //Test case #2:
        //kiem tra ham co chay dung voi 2!, huy vong nhan ve so 2
        //input n=2;
        //goi ham getFactorial(2)
        //expected nhan ve phai la 2
        //thuc te la may?? chay moi biet
        System.out.println("2! | Status: | expected: 2" + " | actual:" + MathUtil.getFactorial(2));

        //Test case #3
        //n=5, 5! hy vong tra ve 120
        System.out.println("5! | Status: | expected: 120" + " | actual:" + MathUtil.getFactorial(5));

        //Test case #4:
        //n=-5!, hy vong bi dap vao mat cau, ca chon, N ko hop le
//        System.out.println("5! | Status: | expected: NGOAI LE XUAT HIEN" + " | actual:" + MathUtil.getFactorial(-5));
        System.out.println("5! | Status: | expected: 120" + " | actual: ");
    }
}
//TONG KET:
//TEST CASE LA GI?? TINH HUONG KIEM THU 
//LA CACH MA NHUNG TINH HUONG XAI APP/KIEM THU APP XEM APP CHAY CO DUNG HAY KHONG 
//1 TEST CASE BAO GOM: DATA DUA VAO APP, VI DU 5! DUA VAO HAM GIAI THUA
//GOI HAM DE XU LY DATA DUA VAO, getFactorial(5)
//GIA TRI KI VONG HAM SE TRA VE EXPECTED VALUE==120???
//STATUS: HAM CHAY DUNG HAY SAI

//MOT TESTCASE LA 1 TINH HUONG XAI APP/KIEM THU APP DUNG HAY SAI SO VOI 
//KI VONG KHI TA DUA DATA CU THE NAO DO VAO APP/HAM