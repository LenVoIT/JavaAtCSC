package org.example.OOP.Bai2;

import java.util.Scanner;

public class TestTaiKhoan {
    public static void main(String[] args) {
        TaiKhoanNganHang tk1 = new TaiKhoanNganHang(
                "001", "Nguyen Van A", "0777824399", 1000000);
        TaiKhoanNganHang tk2 = new TaiKhoanNganHang(
                "002", "Trinh Cong B", "0777176293", 50000000);
        tk1.hienThiThongTin();
        tk1.napTien(-20000);
        tk1.hienThiThongTin();

        tk2.hienThiThongTin();
        tk2.rutTien(100000);
        tk2.hienThiThongTin();
    }

}
