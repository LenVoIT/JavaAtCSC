package org.example.baiTrongFileZalo.CauTrucReNhanh;

import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giờ 1: ");
        int h = sc.nextInt();
        System.out.println("Nhập phút 1: ");
        int m = sc.nextInt();
        System.out.println("Nhập giây 1: ");
        int s = sc.nextInt();

        System.out.println("Nhập giờ 2:  ");
        int h2 = sc.nextInt();
        System.out.println("Nhập phút 2: ");
        int m2 = sc.nextInt();
        System.out.println("Nhập giây 2: ");
        int s2 = sc.nextInt();

        if(h2 < 0 || h < 0 || m < 0 || m2 < 0 || s < 0 || s2 < 0){
            System.out.println("Thời gian không hợp lệ ");
        } else{
            System.out.println("Hợp lệ ");
        }

        int carryMin = 0; //biến nhớ phút
        int carryHour = 0; //biến nhớ giờ

        //Tính tổng giây
        int tongGiay = s + s2;
        carryMin = tongGiay / 60;
        tongGiay = tongGiay % 60;

        //Tính tổng phút
        int tongPhut = m + m2 + carryMin;
        carryHour = tongPhut / 60;
        tongPhut = tongPhut % 60;

        int tongGio = h + h2 + carryHour;
        int carryDay = tongGio / 24;
        tongGio = tongGio % 24;
        System.out.println("Tổng giờ là: " +
                tongGio + " giờ " +
                tongPhut + " phút " +
                tongGiay + " giây ");
    }
}
