package org.example;

import java.util.Scanner;

public class Bai3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số kWh: ");
        int n = sc.nextInt();
        final int BAC1 = 1806;
        final int BAC2 = 1866;
        final int BAC3 = 2167;
        final int BAC4 = 2729;
        final int BAC5 = 3060;
        final int BAC6 = 3151;
        float tienDien = 0;
        if (n < 0) {
            System.out.println("kWh không thể là số âm");
        } else if (n <= 50) {
            tienDien = n * BAC1;
        } else if (n <= 100) {
            tienDien = (50 * BAC1) + (n - 50) * BAC2;
        } else if (n <= 200) {
            tienDien = (50 * BAC1) + (50 * BAC2) + (n - 100) * BAC3;
        } else if (n <= 300) {
            tienDien = (50 * BAC1) + (50 * BAC2) + (100 * BAC3) + (n - 200) * BAC4;
        } else if (n <= 400) {
            tienDien = (50 * BAC1) + (50 * BAC2) + (100 * BAC3) + (200 * BAC4) + (n - 300) * BAC5;
        } else if (n <= 500) {
            tienDien = (50 * BAC1) + (50 * BAC2) + (100 * BAC3) + (200 * BAC4) + (300 * BAC5) + (n - 400) * BAC6;
        } else {
            tienDien = (50 * BAC1) + (50 * BAC2) + (100 * BAC3) + (200 * BAC4) + (300 * BAC5) + (400 * BAC6) + (n - 500) * 4000;
        }
        System.out.printf("Tiền điện phải trả là: %,.2f VND\n", tienDien);
    }
}
