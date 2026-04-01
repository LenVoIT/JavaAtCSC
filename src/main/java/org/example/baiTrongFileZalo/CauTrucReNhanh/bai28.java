package org.example.baiTrongFileZalo.CauTrucReNhanh;

import java.util.Scanner;

public class bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int d = sc.nextInt();
        System.out.println("Nhập tháng: ");
        int M = sc.nextInt();
        System.out.println("Nhập năm: ");
        int y = sc.nextInt();
        System.out.println("Ngày tháng năm vừa nhập là: " + d + "/" + M + "/" + y);
        boolean isValid = (y > 0) && (M >= 1 && M <= 12) && (d >= 1 && d <= getMaxDay(M, y));
        if (!isValid) {
            System.out.println("Ngày không hợp lệ");
            return;
        }

        if (d > 1) {
            System.out.println("Ngày trước đó là: " + (d - 1) + "/" + M + "/" + y);
        } else {
            M--;
            if (M == 0) {
                M = 12;
                y--;
            }
            d = getMaxDay(M,y);
        }
        System.out.println("Ngày trước đó là: " + d + "/" + M + "/" + y);

    }

    public static int getMaxDay(int M, int y) {
        int maxDay;
        boolean isLeap = (y % 400 == 0 || y % 4 == 0 && y % 100 != 0);
        if (M == 4 || M == 6 || M == 9 || M == 11) {
            maxDay = 30;
        } else if (M == 2) {
            if (isLeap) {
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        } else {
            maxDay = 31;
        }
        return maxDay;
    }
}
