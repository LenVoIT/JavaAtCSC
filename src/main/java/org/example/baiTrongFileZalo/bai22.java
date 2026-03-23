package org.example.baiTrongFileZalo;

import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gvc;
        int grc;
        do{
            System.out.println("Giờ vào ca: ");
            gvc = sc.nextInt();
            System.out.println("Giờ ra ca: ");
            grc = sc.nextInt();
            if(gvc < 6 || grc > 18 || gvc >= grc){
                System.out.println("Nhập sai điều kiện giờ ");
            }
        }while (gvc < 6 || grc > 18 || gvc >= grc);
        int gioLamTruoc12h = 0;
        int gioLamSau12h = 0;
        if(grc < 12){
            gioLamTruoc12h = grc - gvc;
        } else if (gvc >= 12) {
            gioLamSau12h = grc - gvc;
        } else {
            gioLamTruoc12h = 12 - gvc;
            gioLamSau12h = grc - 12;
        }
        int tienLuong = (gioLamTruoc12h * 6000 + gioLamSau12h * 7500);
        System.out.println("Tiền lương là: " + tienLuong);
    }
}
