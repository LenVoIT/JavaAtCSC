package org.example.baiTrongCSC.CauTrucLap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bảng cửu chương cần in từ: ");
        int a = sc.nextInt();
        System.out.print("Nhập bảng cửu chương cần in đến: ");
        int b = sc.nextInt();
        int result;
        for (int j = 1; j <= 10; j++){
            for (int i = a; i <= b; i++) {
//                result = i * j;
//                System.out.println(i + "*"+ j + " = " + result);
                System.out.printf("%d x %2d = %-3d   ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
