/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {

    //n! = 1.2.3.4.5.6...n
    //Quy ước: 0! = 1!=1
    //Ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm
    //một cái ngoại lệ, chửi éo tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        }
        //hàm dừng liền éo cần return

        //xuống đây là n = 0..20 òi
        if (n == 0 || n == 1) {
            return 1; //dừng ngay khi n đặc biệt
        }        //xuống đến đây, n =2..20 òi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        //i = 2, i = 3, i = 4, i = 5, i =n nhồi liên tục i vào tích
        long product = 1;
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;

    }
}
