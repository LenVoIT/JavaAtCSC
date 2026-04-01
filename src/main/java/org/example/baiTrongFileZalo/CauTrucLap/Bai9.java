package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;
//Cho nhập số n, số bắt đầu a và công bội q (tất cả là số nguyên dương).
// In lên màn hình n số hạng đầu tiên của cấp số nhân
public class Bai9 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số lượng phần tử n: ");
            int n = sc.nextInt();
            System.out.print("Nhập số bắt đầu a: ");
            int a = sc.nextInt();
            System.out.print("Nhập công bội q: ");
            int q = sc.nextInt();
            for(int i = a; i <= (a * Math.pow(q,n-1))  ;i *= q){
                System.out.print(i + " ");
            }
        }
        // n = 5; a = 2; q = 3
        // Số 1: a          2
        // Số 2: a * q      2 * 3 = 6
        // Số 3: a * q * q     2 * 3 * 3 = 18
        // Số 4: a * q * q * q     2 * 3 * 3 * 3 = 54
        // Số 5: a * q * q * q * q     2 * 3 * 3 * 3 * 3 = 176

        // => a * q^(n - 1) = 2 *
}

