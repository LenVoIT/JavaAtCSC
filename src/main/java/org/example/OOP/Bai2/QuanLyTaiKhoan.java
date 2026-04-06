package org.example.OOP.Bai2;

import java.util.*;

public class QuanLyTaiKhoan {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<TaiKhoanNganHang> danhSachTK = new ArrayList<>();

    public void menu()  {
        int choice;
        do {
            System.out.println("============MENU============");
            System.out.println("1.Tạo tài khoản");
            System.out.println("2.Xem danh sách tài khoản");
            System.out.println("3.Sắp xếp theo số tài khoản tăng dần");
            System.out.println("4.Sắp xếp theo tên tài khoản giảm dần");
            System.out.println("5.Tìm tài khoản theo số tài khoản");
            System.out.println("6.Tìm tài khoản có số dư nhiều nhất");
            System.out.println("7.Dừng chương trình");
            System.out.println("Bạn chọn chức năng(1-7): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    taoTaiKhoan();
                    break;
                case 2:
                    System.out.println("Số tài khoản\t|\tChủ tài khoản \t\t|\t SĐT\t|\t Số dư");
                    xemDanhSachTaiKhoan();
                    break;
                case 3:
                    sapXepTheoSoTaiKhoanTangDan();
                    break;
                case 4:
                    sapXepTheoTenTaiKhoanGiamDan();
                    break;
                case 5:
                    timTaiKhoanTheoSTK();
                    break;
                case 6:
                    findBankAccountByMaxBalance();
                    break;
                case 7:
                    System.out.println("Đang thoát chương trình....");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thoát thành công");
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }
        } while (choice != 7);
    }

    public void taoTaiKhoan() {
        System.out.print("Nhập số tài khoản: ");
        String stk = sc.nextLine();
        for (TaiKhoanNganHang tk : danhSachTK) {
            if (tk.getSoTaiKhoan().equals(stk)) {
                System.out.print("Số tài khoản đã tồn tại!!!!");
                return;
            }
        }
        System.out.print("Nhập tên chủ tài khoản: ");
        String tenChuTK = sc.nextLine();
        System.out.print("Nhập SDT: ");
        String SDT = sc.nextLine();
        System.out.print("Nhập số dư ban đầu: ");
        double soDu = sc.nextDouble();
        sc.nextLine();
        if (soDu >= 0) {
            danhSachTK.add(new TaiKhoanNganHang(stk, tenChuTK, SDT, soDu));
            System.out.println("Tạo tài khoản thành công ");
        } else {
            System.out.println("Không hợp lệ!!! ");
        }


    }

    public void xemDanhSachTaiKhoan() {
        if (danhSachTK.isEmpty()) {
            System.out.println("===========Danh sách tài khoản trống===========");
        }
        for (TaiKhoanNganHang tk : danhSachTK) {
            tk.hienThiThongTin();
        }
    }

    public void sapXepTheoSoTaiKhoanTangDan() {
        danhSachTK.sort(Comparator.comparing(TaiKhoanNganHang::getSoTaiKhoan)); //cách 1
        System.out.println(">> Đã sắp xếp theo số TK tăng dần!");
    }

    public void sapXepTheoTenTaiKhoanGiamDan() {
        danhSachTK.sort(Comparator.comparing(TaiKhoanNganHang::getTenChuTaiKhoan).reversed()); //cách 1
        System.out.println(">> Đã sắp xếp theo tên tài khoản giảm dần!");
    }

    public void timTaiKhoanTheoSTK() {
        System.out.println("Nhập số tài khoản cần tìm: ");
        String findSTK = sc.nextLine();
        for (TaiKhoanNganHang tk : danhSachTK) {
            if (tk.getSoTaiKhoan().equalsIgnoreCase(findSTK)) {
                System.out.println("Đã tìm thấy " + findSTK + "\n");
                tk.hienThiThongTin();
                break;
            }
            System.out.println(findSTK + " không tồn tại");
        }
    }
    public void findBankAccountByMaxBalance() {
        if (danhSachTK.isEmpty()) {
            System.out.println("===========Danh sách tài khoản trống===========");
        }
        TaiKhoanNganHang maxAcc = danhSachTK.get(0);
        for (TaiKhoanNganHang tk: danhSachTK){
            if(tk.getSoDu() > maxAcc.getSoDu()){
                maxAcc = tk;
            }
        }
        System.out.println("Tài khoản co so du lon nhat la: ");
        maxAcc.hienThiThongTin();
    }

}

