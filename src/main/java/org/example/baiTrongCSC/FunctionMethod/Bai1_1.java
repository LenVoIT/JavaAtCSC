package org.example.baiTrongCSC.FunctionMethod;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Bai1_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập ngày theo định dạng dd/MM/yyyy: ");
        String date = sc.nextLine();
        if(kiemTraNgayThangNam(date)){
            System.out.println("Ngày hợp lệ");
        }else {
            System.out.println("Ngày không hợp lệ");
        }

    }

    public static boolean kiemTraNgayThangNam(String date) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy")
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate localDate = LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;

        }
    }


    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
