package com.thang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

    /**
     * KIEM THU TINH HUONG CA CHON, DUA DATA VAO CA CHON THI NHAN VE CU TAT
     * EXECPTION HAM getFactory() duoc thiet ke de neu dua vao n tu te 0..20->
     * sure phai ra 1 con n! dung dan neu dua n vao ca chon n<0||n>20 nem ra
     * exception neu dua -5 vao nhan ngoai le thay ngoai le nhu ky vong o -5! ->
     * viet dung roi, mau xanh
     */

    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsExecrption() {
        //Test case 6:
        /**
         * n=-5, huy vong bi va vao mat mot cai exeception khong xai
         * ASSERTEQUALS() vi no dung cho cac gia tri cu the con ngoai le la mot
         * thu do luong bang cach nay co xuat hien hay khong
         */
        MathUtil.getFactorial(-5);
//ngoai le cam chac trong tay nhung phai dom xem 

    }

    @Test
    public void tryAssertion() {
        Assert.assertEquals(100, 100);
    }

    @Test //quy tac dat ten ham phai mang y nghia cua cac testcase minh muon test: coding convention
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case 1 - tinh huong kiem thu xai ham getF() dau tien
        /**
         * n=0, hy vong expected =1,actual la may goi ham moi biet dc neu
         * expected==actual, ham dung, mau xanh neu expected!=actual, ham sao,
         * mau do
         */
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        //phai so sanh 2 gia tri nay

        /**
         * Testcase 2: n=1, hy vong expected tra ve 1 thu te actual la may
         */
        Assert.assertEquals(expected, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        /**
         * NEU VIEC CHAY TEST CASE RA MAU XANH, KHI VA CHI KHI TAT CA DEU XANH
         * XANH:KHI TAT CA CAC TEST CASE CUNG XANH DO: CHI CAN 1 THANG TRONG DAM
         * TEST CO MAU DO THI TAT CA MAU DO KHI RA MAU XANH TONG, HAM ON VOI CAC
         * TEST CASE KHI RA MAU DO, NGHIA LA CO IT NHAT 1 VIEC SO SANH
         * EXPECTED!=ACTUAL MAU DO LA VI DO ACTUAL TRA VE KHONG DUNG NHU KY VONG
         * DO EXPECTED TINH TOAN KO DUNG LUON
         */

    }
}
//TRONG CLASS NAY CHUA GI
/**
 * CLASS NAY CHUA CAC DOAN CODE DUNG DE TEST CODE CHINH O BEN THU MUC SOURCE CAC
 * DOAN CODE O DAY SE DUNG DE TEST HAM GetFactorial() COI THU CHAY DUNG KHONG
 * NHUNG DOAN CODE NAY DO DEVELOPER VIET RA DE TEST CODE O THU MUC SOURCE DE DAM
 * BAO HAM HAY CLASS VIET RA CHAY DUNG DOAN CODE DUNG DE TEST CODE THI DC GOI LA
 * TEST SCRIPT CAC TEST SCRIPT NAY SE CO LENH CO BAN DE SO SANH GIUA EXPECTED VA
 * ACTUAL NHU BEN HAM MAIN DA TUNG LAM NHUNG DOAN CODE NAY SE KO DUNG LENH
 * SOUT() TRUYEN THONG MA DUNG NHUNG NHUNG THU VIEN DAC BIET DE KHI HAM SAI, KHI
 * EXPECTED KO GIONG ACTUAL, THI NO NEM RA MAU DO KHI HAM CHAY DUNG, TUC LA
 * EXPECTED==ACTUAL, THI NO NEM RA MAU XANH CAC THU VIEN GIUP THAY RA MAU XANH
 * DO, TU SO SANH GIUA EXPECTED VA ACTUAL DE KET LUAN HAM DUNG SAI, MAT CHI CAN
 * NHIN 2 MAU XANH DO, KHONG CAN XEM CHI TIET CAC DONG BEN HAM MAIN BO THU VIEN
 * NAY CON DC GOI LA UNIT TEST FRAMEWORK MOI NGON NGU LAP TRINH DEU CO VAI BO
 * THU VIEN XANH DO GIUP CAC DEV TEST HAM CUA MINH VI DU: JAVA:Junit,TestNG
 * c#:xUnit,NUnit,MSTest PHP:phpUnit JavaScript:...... Python:...
 *
 * @test dc goi la flag/co danh dau - ANNOTATION de bao hieu cho thu vien JUnit
 * biet GENERATE ham di kem @TEST bien ham nay thanh ham MAIN() va gui ham nay
 * cho JVM biet de chay, khi chay thi so sanh giua 2 dua EXPECTED va ACTUAL coi
 * neu chung bang nhau, thay mau xanh neu chung != nhau, thay mau do nen khong
 * co @TEST, cha co ham MAIN() nao dc GENERATE, NO RUNNABLE TEST viec xai thu
 * vien ma bi ep phai lam gi do, dc goi la framework
 */
