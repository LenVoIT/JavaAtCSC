package org.example.baiTrongFileZalo;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        System.out.print("Nhập d: ");
        int d = sc.nextInt();
        System.out.print("Nhập e: ");
        int e = sc.nextInt();
        System.out.print("Nhập f: ");
        int f = sc.nextInt();
        float D = a * e - b * d;
        System.out.println("D = " + D);
        float Dx = c * e - b * f;
        System.out.println("Dx = " + Dx);
        float Dy = a * f - d * c;
        System.out.println("Dy = " + Dy);
        if (D != 0){
            float x = Dx / D;
            System.out.println("X = " + x);
            float y = Dy / D;
            System.out.println("Y = " + y);
        } else {
            if (Dx != 0 || Dy != 0){
                System.out.println("Phương trình vô nghiệm");
            } else{
                System.out.println("Phương trình vô số nghiệm");
            }
        }
    }
}
