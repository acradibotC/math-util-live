/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Anhnt206
 */
public class MathUtilLive {

    
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        
//        MathUtil.getFactorial(-5); ném ngoại lệ thật rồi, ai biểu đưa cà chớn
        
        
        
        //kĩ tuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! = 120
        //hàm ao đó viết khi chạy thực tế là mấy - actual, giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
    }
    
}
