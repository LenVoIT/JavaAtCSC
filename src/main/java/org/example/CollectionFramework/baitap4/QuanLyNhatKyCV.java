package org.example.CollectionFramework.baitap4;

import java.util.Scanner;

public class QuanLyNhatKyCV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhatKyCongViec ql = new NhatKyCongViec();

        // ===== 1. Nhập danh sách =====
        System.out.println("Nhập công việc (bỏ trống mã để kết thúc):");
        while (true) {
            System.out.print("Nhập mã công việc: ");
            String ma = sc.nextLine();

            if (ma.isEmpty()) break;

            System.out.print("Nội dung công việc: ");
            String noiDung = sc.nextLine();

            ql.themCongViec(ma, noiDung);
        }

        // ===== 2. Hiển thị =====
        ql.hienThi();

        // ===== 3. Cập nhật =====
        System.out.print("\nNhập mã công việc cần cập nhật: ");
        String maUpdate = sc.nextLine();

        System.out.print("Nội dung mới: ");
        String noiDungMoi = sc.nextLine();

        if (ql.capNhat(maUpdate, noiDungMoi)) {
            System.out.println("Đã cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy mã.");
        }

        // ===== 4. Xóa =====
        System.out.print("\nNhập mã công việc cần xóa: ");
        String maXoa = sc.nextLine();

        if (ql.xoa(maXoa)) {
            System.out.println("Đã xóa thành công.");
        } else {
            System.out.println("Không tìm thấy mã.");
        }

        // ===== 5. Hiển thị lại =====
        System.out.println("\nDanh sách công việc sau cập nhật:");
        ql.hienThi();
    }
}
