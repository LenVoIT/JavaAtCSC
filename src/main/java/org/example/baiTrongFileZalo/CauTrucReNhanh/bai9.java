package org.example.baiTrongFileZalo.CauTrucReNhanh;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.print( a + " là số lớn nhất");
        }else if(b > a && b > c){
            System.out.print( b + " là số lớn nhất");
        }else {
            System.out.print( c + " là số lớn nhất");
        }
    }
}
