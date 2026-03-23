package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bai2_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số tiền muốn đổi: ");
            int tienDoi = sc.nextInt();
            int to500 = tienDoi / 500000;
            tienDoi = tienDoi % 500000;
            int to200 = tienDoi / 200000;
            tienDoi = tienDoi % 200000;
            int to100 = tienDoi / 100000;
            tienDoi = tienDoi % 100000;
            int to50 = tienDoi / 50000;
            tienDoi = tienDoi % 50000;

            System.out.println("Số tờ mệnh giá 500k: " + to500);

            System.out.println("Số tờ mệnh giá 200k: " + to200);
            System.out.println("Số tờ mệnh giá 100k: " + to100);
            System.out.println("Số tờ mệnh giá 50k: " + to50);
            System.out.println("Số tiền còn dư: " + tienDoi);
        }
    }
