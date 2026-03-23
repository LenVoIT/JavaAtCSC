package org.example.baiTrongFileZalo;

import java.util.Scanner;

public class Bai3_6 {
    static Scanner sc = new Scanner(System.in);
    static final int phongLoai1 = 1260000;
    static final int phongLoai2 = 1550000;
    static final int phongLoai3 = 1830000;
    static final int phongLoai4 = 2120000;
    static final int phongLoai5 = 2120000;
    static final int phongLoai6 = 2120000;
    static final int phongLoai7 = 2540000;
    static final int phongLoai8 = 4800000;
    public static void main(String[] args) {
        menuPhong();

    }

    public static void menuPhong() {
        int choice;
        do {
            System.out.println("===========DANH SÁCH LOẠI PHÒNG===========");
            System.out.println("1. Standard - 1,260,000 VND");
            System.out.println("2. Superior Garden View - 1,550,000 VND");
            System.out.println("3. Superior Ocean View - 1,830,000 VND");
            System.out.println("4. Garden View Bungalow - 2,120,000 VND");
            System.out.println("5. Pool View Bungalow - 2,120,000 VND");
            System.out.println("6. Family Room - 2,120,000 VND");
            System.out.println("7. Beach Front Bungalow - 2,540,000 VND");
            System.out.println("8. VIP Sea View - 4,800,000 VND");
            System.out.println("Bạn chọn loại phòng(1-8): ");
            choice = sc.nextInt();
            if (choice < 1 || choice > 8) {
                System.out.println("Nhập sai, nhập lại ");
            }
        } while (choice < 1 || choice > 8);
        System.out.println("Số đêm ở: ");
        int nights = sc.nextInt();
        int price = switch (choice) {
            case 1 -> phongLoai1;
            case 2 -> phongLoai2;
            case 3 -> phongLoai3;
            case 4 -> phongLoai4;
            case 5 -> phongLoai5;
            case 6 -> phongLoai6;
            case 7 -> phongLoai7;
            case 8 -> phongLoai8;
            default -> 0;
        };
        double total;
        if(nights >= 2 && nights <= 3){
            total = price * nights * 0.75;
        } else if (nights >= 4) {
            total = price * nights * 0.7;
        }else {
            total = price * nights;
        }
        System.out.printf("Tổng tiền phòng là: %,.2f VND\n", total);
    }
}

