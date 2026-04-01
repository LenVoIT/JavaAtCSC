package org.example.baiTrongFileZalo.CauTrucReNhanh;

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
        boolean isLeap = (y % 400 == 0) || (y % 4 == 0 & y % 100 == 0);

        // số ngày trong từng tháng
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //nếu năm nhuận thì tháng 2 là 29 ngày
        if(isLeap){
            days[1] = 29;
        }
        //kiểm soát input
        if(M < 1 || M > 12 || d < 1 || d > days[M-1]){
            System.out.println("Input day invalid !!!!");
        }
        //tính tổng ngày
        int totalDays = 0;
        for(int i = 0; i < M-1; i++){
            totalDays += days[i];
        }
        totalDays += d;
        System.out.println("Ngày " + d + "/" + M + "/" + y + " là ngày thứ " + totalDays + " trong năm");
    }
}
