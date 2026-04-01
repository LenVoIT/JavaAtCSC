package org.example.baiTrongFileZalo.CauTrucReNhanh;

import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số km: ");
        int km = sc.nextInt();
        if(km <= 30){
            int tongTien = 5000 * km;
            System.out.println("Số tiền phải trả là: " + tongTien);
        }else {
            int km1 = km - 30;
            int tongTienHon30 = (3000 * km1) + (5000 * 30);
            System.out.println("Số tiền phải trả là: " + tongTienHon30);
        }
    }
}
