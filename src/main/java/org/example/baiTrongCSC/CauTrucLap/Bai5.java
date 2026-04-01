package org.example.baiTrongCSC.CauTrucLap;

import java.util.Scanner;

public class Bai5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        int choice;
        float tongTien = 0;
        int soLuongVe;
        int veNguoiLon = 0;
        int veTreEm = 0;
        int veSinhVien = 0;

        do {
            System.out.println("=========MENU=========");
            System.out.println("1.Vé người lớn - 100k");
            System.out.println("2.Vé trẻ em - 50k");
            System.out.println("3.Vé sinh viên - 70k");
            System.out.println("0.Thoát");
            System.out.println("Chọn loại vé (1-3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng vé người lớn muốn mua: ");
                    soLuongVe = sc.nextInt();
                    veNguoiLon += soLuongVe;
                    tongTien += (veNguoiLon * 100000);
                    break;
                case 2:
                    System.out.println("Nhập số lượng vé trẻ em muốn mua: ");
                    soLuongVe = sc.nextInt();
                    veTreEm += soLuongVe;
                    tongTien += (veTreEm * 50000);
                    break;
                case 3:
                    System.out.println("Nhập số lượng vé sinh viên muốn mua: ");
                    soLuongVe = sc.nextInt();
                    veSinhVien += soLuongVe;
                    tongTien += (veSinhVien * 70000);
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
        System.out.println("==========THÔNG TIN MUA VÉ==========");
        System.out.println("Tổng số vé người lớn: " + veNguoiLon);
        System.out.println("Tổng số vé trẻ em: " + veTreEm);
        System.out.println("Tổng số vé sinh viên: " + veSinhVien);
        System.out.printf("Tổng tiền cho %d vé là: %,.0f VND",veNguoiLon + veTreEm + veSinhVien,tongTien);


    }
}

//  n