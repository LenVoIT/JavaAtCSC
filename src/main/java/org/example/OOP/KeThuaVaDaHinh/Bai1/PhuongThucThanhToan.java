package org.example.OOP.KeThuaVaDaHinh.Bai1;

public class PhuongThucThanhToan {
    protected double soTien;
    protected String ngayGiaoDich;

    public PhuongThucThanhToan() {
    }

    public PhuongThucThanhToan(double soTien, String ngayGiaoDich) {
        this.soTien = soTien;
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    @Override
    public String toString() {
        return String.format("Giao dịch: %,.2f vào ngày %s ", soTien,ngayGiaoDich);
    }
}
