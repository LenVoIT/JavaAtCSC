package org.example.baiTrongFileZalo.ArrayArrayList;

import java.util.Arrays;
import java.util.Scanner;

//Tạo mảng A gồm n phần tử (n>0), với yêu cầu chỉ cho người dùng nhập giá trị
//của các phần tử của mảng là số nguyên tố
// Mở rộng cho các trường hợp số hoàn thiện, số chính phương, …
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n(n>0): ");
            n = sc.nextInt();
        } while (n <= 0);
        int[] numArr = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("a[" + i + "] = ");
                int x = sc.nextInt();
                if (isPrime(x)) {
                    numArr[i] = x;
                    break;
                } else {
                    System.out.println(x + " khong phai la so nguyen to, xin nhap lai!!!");
                }
            }
        }
        System.out.print("Mang vua nhap la: " + Arrays.toString(numArr));
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
