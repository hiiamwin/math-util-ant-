/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thang.mathutil.core;

/**
 *
 * @author thangbv
 */
// ta se mo phong/clone class Math cua JDK
// class cua ta viet se cung cap cac ham/method tien ich dung chung 
//cho nhieu noi khac nhau
//thuong cai gi ma la tien ich/tool dung cho cac noi thi no se
//duoc thiei ke la STATIC
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //ham tien ich dung chung tinh giai thua!!!
    //Quy uoc n!=1.2.3......n
    //khong tinh giai thua so am
    //0!=1!=1
    //21! cuc ki to, vuot 18 so 0, vuot 18 so 0 la tran kieu long
    //ta quy uoc ko tinh 21! tro len, vi tran long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //song sot den day, sure, n chay tu 2..20
        long product = 1;//khoi dau giai thua la 1
        //bien tich luy/gui gop/nhan don/con heo dat
        //acc-accumulation
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
//ky thuat TDD - TEST DRIVEN DEVELOPMENT - DANH CHO DEVELOPER
//LA KY THUAT LAP TRINH/ PHONG CACH LAP TRINH MA KHI VIET CODE THI PHAI 
//VIET LUON CAC BO KIEM THU - TEST CASES DE KIENM TRA NGAY CODE CUA MINH 
//CHAY DUNG HAY SAI
//LA KY THUAT LAP TRINH VIET CODE CHAY SONG SONG VOI VIET CAC TEST CASES
//KY THUAT NAY GIUP CODE LIEN TUC LIEN TUC DUOC KIEM TRA XEM MAY CHAY
//CO DUNG NHU KY VONG HAY KHONG?
//NEU TA XAI TDD, NO GIUP TA DI VAO QUY TRINH CI - CONTINOUS INTEGRATION

//DE LAM TDD TA:
//1.VIET PHAC THAO PROTOTYPE CUA HAM/METHOD/CLASS
//2.VIET CAC BO KIEM THU/ TEST CASES LA DOAN CODE BO SUNG THEM
//NHUNG LA CODE DE XAI CAI HAM VUA VIET, DE XEM HAM VUA VIET ON KO
//3.CHAY THU HAM VUA VIET VOI BO TEST CASES VUA TAO, XEM TINH HINH HAM 
//DUNG SAI RA SAO, SAI-->REFACTOR,SUA CODE
//                 DUNG-->HOAN THIEN TIEP CODE KHAC
