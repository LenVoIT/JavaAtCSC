package org.example.OOP.KeThuaVaDaHinh.Bai2;

public class NhanVienThucTap extends NhanVien{
    private double luongThucTap;

    public NhanVienThucTap() {
    }

    public NhanVienThucTap(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh, double luongThucTap) {
        super(hoTen, diaChi, soDienThoai, email, ngaySinh);
        this.luongThucTap = luongThucTap;
    }

    @Override
    public double tinhLuong() {
        return luongThucTap;
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("[Intern] ");
        super.hienThiThongTin();
    }
}
