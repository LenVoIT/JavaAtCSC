package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;
//Cho nhập số n, số bắt đầu a và công sai d (tất cả là số nguyên dương). In lên
//màn hình n số hạng đầu tiên của cấp số cộng.
//n = 6
//a = 10
//d = 5
//        10 + 15 + 20 + 25 + 30 + 35
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.print("Nhập số bắt đầu a: ");
        int a = sc.nextInt();
        System.out.print("Nhập công sai d: ");
        int d = sc.nextInt();
        for(int i = a; i <= a + (n - 1) * d;i += d){
            System.out.print(i + " ");
        }
    }
    //CÔNG THỨC CẤP SỐ CỘNG: a + (n - 1) * d
    //ví dụ: //n = 6
    //a = 10
    //d = 5
    //Số 1 = a          => 10          = 10
    //Số 2 = a + 1d     => 10 + 5      = 15
    //Số 3 = a + 2d     => 10 + 10     = 20
    //Số 4 = a + 3d     => 10 + 15     = 25
    //.... => total = a + (n - 1) * d

}
