package org.example.OOP.KeThuaVaDaHinh.Bai1;

public class ChuyenKhoan extends PhuongThucThanhToan{
    private String tenNganHang;

    public String getTenNganHang() {
        return tenNganHang;
    }

    public ChuyenKhoan(double soTien, String ngayGiaoDich, String tenNganHang) {
        super(soTien, ngayGiaoDich);
        this.tenNganHang = tenNganHang;
    }

    public ChuyenKhoan() {
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }

    @Override
    public String toString() {
        return String.format("Chuyển khoản: %,.2fVND vào ngày %s qua ngân hàng %s",
               soTien, ngayGiaoDich, tenNganHang);
    }
}
