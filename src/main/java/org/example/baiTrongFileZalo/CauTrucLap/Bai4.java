package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input positive integer n: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.print("Input invalid !!!");
        }
        System.out.print("Numbers smaller than " + n + " from 1 and are odd numbers: " );
        for(int i = 1; i < n; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
