package org.example.baiTrongCSC.CauTrucLap;

import java.util.Scanner;

public class Bai6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int choice;
        int soLuong;
        int tongSLSua = 0;
        int tongSLBanhNgot = 0;
        int tongSLNuocNgot = 0;
        int tongSLBanhMan = 0;
        int tongSLTraiCay = 0;
        int tongTien = 0;

        do {
            System.out.println("=========MENU=========");
            System.out.println("1.Sữa tươi - 7k");
            System.out.println("2.Bánh ngọt - 10k");
            System.out.println("3.Nước ngọt - 10k");
            System.out.println("4.Bánh mặn - 15k");
            System.out.println("5.Trái cây - 20k");
            System.out.println("0.Kết thúc mua hàng");
            System.out.println("Bạn chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sữa tươi: ");
                    soLuong = sc.nextInt();
                    tongSLSua += soLuong;
                    tongTien += (tongSLSua * 7000);
                    break;
                case 2:
                    System.out.println("Nhập số bánh ngọt muốn mua: ");
                    soLuong = sc.nextInt();
                    tongSLBanhNgot += soLuong;
                    tongTien += (tongSLBanhNgot * 10000);
                    break;
                case 3:
                    System.out.println("Nhập số lượng nước ngọt muốn mua: ");
                    soLuong = sc.nextInt();
                    tongSLNuocNgot += soLuong;
                    tongTien += (tongSLNuocNgot * 10000);
                    break;
                case 4:
                    System.out.println("Nhập số lượng bánh mặn muốn mua: ");
                    soLuong = sc.nextInt();
                    tongSLBanhMan += soLuong;
                    tongTien += (tongSLBanhMan * 15000);
                    break;
                case 5:
                    System.out.println("Nhập số lượng trái cây muốn mua: ");
                    soLuong = sc.nextInt();
                    tongSLTraiCay += soLuong;
                    tongTien += (tongSLTraiCay * 10000);
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình...");
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException i){
                        i.printStackTrace();
                    }
                    System.out.println("Thoát thành công");
                    break;
                default:
                    System.out.println("Không hợp lệ, nhập lại");
            }
        } while (choice != 0);
        System.out.println("==========THÔNG TIN GIỎ HÀNG==========");
        if(tongSLSua > 0){
            System.out.printf("Sữa tươi: %d hộp.Thành tiền: %,.2fVND\n", tongSLSua, (float)(tongSLSua * 7000));
        }
        if (tongSLBanhNgot > 0) {
            System.out.printf("Bánh ngọt: %d cái.Thành tiền: %,.2fVND\n", tongSLBanhNgot, (float)(tongSLBanhNgot * 10000));
        }
        if (tongSLNuocNgot > 0) {
            System.out.printf("Nước ngọt: %d lon.Thành tiền: %,.2fVND\n", tongSLNuocNgot, (float)(tongSLNuocNgot * 10000));
        }
        if (tongSLBanhMan > 0) {
            System.out.printf("Bánh mặn: %d cái.Thành tiền: %,.2fVND\n", tongSLBanhMan, (float)(tongSLBanhMan * 15000));
        }
        if (tongSLTraiCay > 0) {
            System.out.printf("Trái cây: %d trái.Thành tiền: %,.2fVND\n", tongSLTraiCay, (float)(tongSLTraiCay * 20000));
        }
        System.out.printf("Tổng tiền: %,.2fVND\n", (float)tongTien);
    }
}
