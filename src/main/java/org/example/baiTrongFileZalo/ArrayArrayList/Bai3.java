package org.example.baiTrongFileZalo.ArrayArrayList;

import java.util.Scanner;

//Tạo mảng A gồm n phần tử (n>0), với yêu cầu giá trị của phần tử nhập sau trong
//mảng phải lớn hơn hoặc bằng phần tử liền trước (sau khi nhập hoàn tất, ta thu
//được mảng được sắp xếp tăng dần).
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập n (n>0): ");
            n = sc.nextInt();
        } while (n <= 0);
        // nhập phần tử đầu tiên
        int[] numArr = new int[n];
        System.out.print("a[0] = ");
        numArr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) { //duyệt từ phần tử thứ 2
            while (true) {
                System.out.print("a[" + i + "] = ");
                int a = sc.nextInt();
                if (a >= numArr[i - 1]) {
                    numArr[i] = a;
                    break;
                } else {
                    System.out.println("Sai! Phải >= " + numArr[i - 1] + ". Nhập lại.");
                }
            }
        }
    }
}
