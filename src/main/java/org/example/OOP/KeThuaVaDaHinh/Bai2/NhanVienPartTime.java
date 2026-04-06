package org.example.OOP.KeThuaVaDaHinh.Bai2;

public class NhanVienPartTime extends NhanVien{
    private double soGioLamViec;
    private double tienCongGio;

    public NhanVienPartTime(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh, double tienCongGio, double soGioLamViec) {
        super(hoTen, diaChi, soDienThoai, email, ngaySinh);
        this.tienCongGio = tienCongGio;
        this.soGioLamViec = soGioLamViec;
    }

    public NhanVienPartTime() {}

    @Override
    public double tinhLuong() {
        return soGioLamViec * tienCongGio;
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("[Parttime] ");
        super.hienThiThongTin();
    }
}
