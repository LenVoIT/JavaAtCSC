package org.example.OOP.KeThuaVaDaHinh.Bai2;

public class NhanVienFullTime extends NhanVien{
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh, double luongCoBan, double tienThuong) {
        super(hoTen, diaChi, soDienThoai, email, ngaySinh);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + tienThuong;
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("[FullTime] ");
        super.hienThiThongTin();
    }
}
