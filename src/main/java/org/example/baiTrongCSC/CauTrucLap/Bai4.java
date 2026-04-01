package org.example.baiTrongCSC.CauTrucLap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi ban đầu: ");
        float tienGui = sc.nextFloat();
        System.out.println("Nhập lãi suất %/năm: ");
        int laiSuat = sc.nextInt();
        float tienLaiVaVon = tienGui;
        int i = 1;
        do{
            tienLaiVaVon = tienLaiVaVon + (tienLaiVaVon * laiSuat / 100);
            System.out.printf("Số tiền hiện tại sau năm %d : %,.2f VND\n",i, tienLaiVaVon);
            i++;
        }while (tienLaiVaVon < 2 * tienGui);

    }
}
