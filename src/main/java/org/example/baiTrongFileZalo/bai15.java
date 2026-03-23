package org.example.baiTrongFileZalo;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 2 số a,b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Nhập phép tính mong muốn (+,-,x,/): ");
        String s = sc.next();
        if(s.equals("+")){
            System.out.println("Tổng: " + (a + b));
        }else if(s.equals("-")){
            System.out.println("Hiệu: " + (a - b));
        } else if (s.equals("x")) {
            System.out.println("Tích: " + (float)(a * b));
        } else if (s.equals("/")) {
            if (b == 0){
                System.out.println("Lỗi chia cho 0!!!");
            }else {
                float thuong = (float)a / b;
                System.out.println("Thương: " + thuong);
            }
        }

    }
}
