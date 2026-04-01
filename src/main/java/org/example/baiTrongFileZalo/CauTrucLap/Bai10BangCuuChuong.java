package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;

public class Bai10BangCuuChuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int result;
        System.out.print("Bảng cửu chương của " + n + " là: \n");
        for(int i = 1; i <= 10; i++){
            result = n * i;
            System.out.println(n + "*"+ i + " = " + result);
        }
    }
}
