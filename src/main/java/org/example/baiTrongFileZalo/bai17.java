package org.example.baiTrongFileZalo;

import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = sc.nextInt();
        int tram = n / 100;
        int chuc = n / 10 % 10;
        int donVi = n % 10;
        int max = Math.max(tram,chuc);
        int max2 = Math.max(max,donVi);
        System.out.println(max2);
    }
}
