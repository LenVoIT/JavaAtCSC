package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        float tienGui = sc.nextFloat();
        System.out.print("Nhập số tháng gửi: ");
        int soThang = sc.nextInt();
        System.out.print("Nhập lãi suất năm (%): ");
        float laiSuat = sc.nextFloat();

        float tienLai = (tienGui * soThang) * (laiSuat / 100 / 12);
        float tongTienGuiVaLai = tienGui + tienLai;

        NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        formatter.setMaximumFractionDigits(2);
        formatter.setMinimumFractionDigits(2);
        System.out.println("Tiền lãi là: " + formatter.format(tienLai));
        System.out.println("Tiền tổng là: " + formatter.format(tongTienGuiVaLai));
    }
}