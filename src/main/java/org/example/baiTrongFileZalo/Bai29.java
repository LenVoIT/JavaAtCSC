package org.example.baiTrongFileZalo;

import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int d = sc.nextInt();
        System.out.println("Nhập tháng: ");
        int M = sc.nextInt();
        System.out.println("Nhập năm: ");
        int y = sc.nextInt();
        System.out.println("Ngày tháng năm vừa nhập là: " + d + "/" + M + "/" + y);
    }
}
