package org.example.Exception.Bai2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BaiTapHocVien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HocVien> hocViens = new ArrayList<>();

        // Nhập tổng số học viên
        int n = nhapTongSoHocVien(scanner);

        // Nhập danh sách học viên
        for (int i = 0; i < n; i++) {
            HocVien hocVien = nhapThongTinHocVien(scanner);
            hocViens.add(hocVien);
        }

        // In danh sách học viên
        for (HocVien hocVien : hocViens) {
            System.out.println(hocVien.toString());
        }

    }

    private static HocVien nhapThongTinHocVien(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập mã học viên: ");
        String ma = scanner.nextLine();
        System.out.println("Nhập tên học viên: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập tên môn học: ");
        String monHoc = scanner.nextLine();

        boolean isValidStudenInfo = true;
        double diemSo = 0;
        do {
            try {
                isValidStudenInfo = true;
                System.out.println("Nhập điểm số: ");
                diemSo = scanner.nextDouble();
                if (!(diemSo >= 0 && diemSo <= 10)) {
                    throw new IllegalArgumentException("Điểm môn học từ 0 - 10");
                }
            } catch (InputMismatchException ex) {
                isValidStudenInfo = false;
                System.out.println("Sai kiểu dữ liệu");
                scanner.nextLine();
            } catch (IllegalArgumentException ex) {
                isValidStudenInfo = false;
                System.out.println(ex.getMessage());
            }
        } while (!isValidStudenInfo);

        HocVien hocVien = new HocVien(ma, ten, monHoc, diemSo);
        return hocVien;
    }

    private static int nhapTongSoHocVien(Scanner scanner) {
        int n = 0;
        boolean isValidNumber = true;
        do {
            isValidNumber = true;
            try {
                System.out.println("Nhập tổng số học viên: ");
                n = scanner.nextInt();
                if (n <= 0) {
                    throw new IllegalArgumentException("Số lượng phải > 0");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Sai kiểu dữ liệu");
                isValidNumber = false;
                scanner.nextLine();
            } catch (IllegalArgumentException ex) {
                isValidNumber = false;
                System.out.println(ex.getMessage());
            }
        } while (!isValidNumber);
        return n;
    }
}
