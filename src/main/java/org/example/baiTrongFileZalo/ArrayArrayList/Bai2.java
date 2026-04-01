package org.example.baiTrongFileZalo.ArrayArrayList;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập n nguyên dương:  \n");
            n = sc.nextInt();
        } while (n <= 0);
        int[] numArr = new int[n];
        System.out.println("Nhập số lẻ ở vị trí lẻ, chẵn ở vị trí chẵn");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("a[" + i + "] = ");
                int a = sc.nextInt();
                // index chẵn → số chẵn
                if (i % 2 == 0 && a % 2 == 0) {
                    numArr[i] = a;
                    break;
                }
                // index lẻ → số lẻ
                else if (i % 2 != 0 && a % 2 != 0) {
                    numArr[i] = a;
                    break;
                } else {
                    System.out.println("Nhập sai! Vui lòng nhập lại.");
                }
            }
        }
        System.out.print("Mảng đã nhập là: ");
        for (int x : numArr) {
            System.out.print(x + " ");
        }
    }
}
