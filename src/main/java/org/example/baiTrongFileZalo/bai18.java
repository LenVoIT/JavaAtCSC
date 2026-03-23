package org.example.baiTrongFileZalo;

import java.util.Formatter;
import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm hóa: ");
        double hoa = sc.nextDouble();
        System.out.print("Nhập điểm lý: ");
        double ly = sc.nextDouble();
        System.out.print("Nhập điểm toán: ");
        double toan = sc.nextDouble();
        double average = (toan * 3 + ly * 2 + hoa * 2) / 7;
        System.out.printf("Điểm trung bình là: %.2f\n", average);
        if(average < 5){
            System.out.println("Yếu");
        } else if (average >= 5 && average < 6) {
            System.out.println("Trung bình");
        } else if (average >= 6 && average < 7) {
            System.out.println("TB khá");
        } else if (average >= 7 && average < 8) {
            System.out.println("Khá");
        } else if (average >= 8 && average < 9) {
            System.out.println("Giỏi");
        } else if (average >= 9) {
            System.out.println("Xuất sắc");

        }
    }
}
