package org.example.baiTrongFileZalo;

import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gbd,gkt,soMay;
        int gioTruoc17 = 0, gioSau17 = 0;
        do{
            System.out.println("Giờ bắt đầu thuê: ");
            gbd = sc.nextInt();
            System.out.println("Giờ kết thúc thuê: ");
            gkt = sc.nextInt();
            System.out.println("Số máy thuê: ");
            soMay = sc.nextInt();
            if(gbd < 6 || gbd >= gkt || gkt > 21){
                System.out.println("Nhâp sai, nhập lại");
            }
        } while(gbd < 6 || gbd >= gkt || gkt > 21);
        if(gkt <= 17){
            gioTruoc17 = gkt - gbd;
        } else if (gbd >= 17) {
            gioSau17 = gkt - gbd;
        } else{
            gioTruoc17 = 17 - gbd;
            gioSau17 = gkt - 17;
        }
        int tongTien = (gioTruoc17 * 2500 + gioSau17 * 3000) * soMay;
        System.out.println("Tổng tiền phải trả cho " + soMay + " là: " + tongTien);
    }
}
