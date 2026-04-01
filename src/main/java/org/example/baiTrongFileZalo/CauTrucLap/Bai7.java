package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.print("Nhập sai, nhập lại ");
        }
        boolean isFirst = true;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (total + i > n) {
                break;
            }
            if (!isFirst) {
                System.out.print("+");
            }
            total += i;
            System.out.print(i);
            isFirst = false;
        }
        System.out.print("=" + total);
    }
}
