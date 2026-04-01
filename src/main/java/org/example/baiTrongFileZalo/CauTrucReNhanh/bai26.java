package org.example.baiTrongFileZalo.CauTrucReNhanh;

import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int d = sc.nextInt();
        System.out.println("Nhập tháng: ");
        int M = sc.nextInt();
        System.out.println("Nhập năm: ");
        int y = sc.nextInt();
        boolean isValid = true;
        //kiểm tra năm
        if(y < 0){
            isValid = false;
        }
        //kiểm tra tháng
        if(M < 1 || M > 12) {
            isValid = false;
        }
        //kiểm tra ngày
        int maxDay = 31;
        if(M == 4 || M == 6 || M == 9 || M == 11){
            maxDay = 30;
        }else if(M == 2){
            if((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)){
                maxDay = 29;
            }else {
                maxDay = 28;
            }
        }
        if(d < 1 || d > maxDay) {
            isValid = false;
        }
        if(isValid){
            System.out.println("Ngày nhập vào hợp lệ ");
        }else {
            System.out.println("Ngày nhập vào khong hợp lệ ");
        }
    }
}
