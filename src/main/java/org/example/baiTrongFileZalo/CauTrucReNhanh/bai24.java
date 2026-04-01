package org.example.baiTrongFileZalo.CauTrucReNhanh;

import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giờ: ");
        int h = sc.nextInt();
        System.out.println("Nhập phút: ");
        int m = sc.nextInt();
        System.out.println("Nhập giây: ");
        int s = sc.nextInt();
        if(h > 23 || h < 0 || m < 0 || m > 59 || s < 0 || s > 59){
            System.out.println("Thời gian không hợp lệ ");
        } else{
            System.out.println("Hợp lệ ");
        }
    }
}
