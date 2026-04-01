package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int n;
        do {
            n = sc.nextInt();
            total += n;
        } while (n != 0);

        System.out.print("Total =  " + total);
    }
}
