package org.example.inoutfile.baitap3;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSanPham ql = new QLSanPham();
        ArrayList<SanPham> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tạo mới & ghi file");
            System.out.println("2. Đọc file");
            System.out.println("3. Cập nhật theo mã");
            System.out.println("4. Xóa theo mã");
            System.out.println("5. Thêm sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    list.clear();
                    System.out.print("Nhập số sản phẩm: ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sản phẩm " + (i + 1));

                        System.out.print("Mã: ");
                        String ma = sc.nextLine();

                        System.out.print("Tên: ");
                        String ten = sc.nextLine();

                        double gia;
                        while (true) {
                            try {
                                System.out.print("Giá: ");
                                gia = Double.parseDouble(sc.nextLine());
                                if (gia < 0) throw new IllegalArgumentException();
                                break;
                            } catch (Exception e) {
                                System.out.println("Giá không hợp lệ!");
                            }
                        }

                        System.out.print("Nhà cung cấp: ");
                        String ncc = sc.nextLine();

                        list.add(new SanPham(ma, ten, gia, ncc));
                    }

                    ql.ghiFile(list);
                    break;

                case 2:
                    list = ql.docFile();
                    ql.hienThi(list);
                    break;

                case 3:
                    list = ql.docFile();
                    System.out.print("Nhập mã cần sửa: ");
                    String maSua = sc.nextLine();

                    SanPham spSua = ql.timTheoMa(list, maSua);
                    if (spSua != null) {
                        System.out.print("Tên mới: ");
                        spSua.setTen(sc.nextLine());

                        while (true) {
                            try {
                                System.out.print("Giá mới: ");
                                spSua.setDonGia(Double.parseDouble(sc.nextLine()));
                                break;
                            } catch (Exception e) {
                                System.out.println("Giá không hợp lệ!");
                            }
                        }

                        System.out.print("Nhà cung cấp mới: ");
                        spSua.setNhaCungCap(sc.nextLine());

                        ql.ghiFile(list);
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                case 4:
                    list = ql.docFile();
                    System.out.print("Nhập mã cần xóa: ");
                    String maXoa = sc.nextLine();

                    if (ql.xoa(list, maXoa)) {
                        ql.ghiFile(list);
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                case 5:
                    list = ql.docFile();

                    System.out.print("Mã: ");
                    String ma = sc.nextLine();

                    System.out.print("Tên: ");
                    String ten = sc.nextLine();

                    double gia = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhà cung cấp: ");
                    String ncc = sc.nextLine();

                    list.add(new SanPham(ma, ten, gia, ncc));
                    ql.ghiFile(list);

                    System.out.println("Thêm thành công!");
                    break;
            }

        } while (choice != 0);
    }
}


