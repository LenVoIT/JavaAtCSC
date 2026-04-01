package org.example.baiTrongFileZalo.ArrayArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        soNguyenDuong();
    }
    public static void soNguyenDuong(){
        int n;
        do {
            System.out.print("Nhập n nguyên dương:  \n");
            n = sc.nextInt();
        }while (n <= 0);
        int[] numArr = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.print("a[" + (i+1) + "](>0) = ");
            int a = sc.nextInt();
            numArr[i] = a;
            if(a <= 0){
                System.out.print("Phần tử không nguyên dương. Thoát chương trình...\n");
                break;
            }
        }
        System.out.print("Mảng vừa nhập là: " + Arrays.toString(numArr));
    }
}
