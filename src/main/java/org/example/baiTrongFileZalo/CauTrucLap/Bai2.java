package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;

//Cho nhập chuỗi ký tự (S) và số lần cần in (n). In ra màn hình n lần chuỗi S.
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = sc.nextLine();
        System.out.print("Input number of times to print (n): ");
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            System.out.print(s + "\n");
        }
    }
}
