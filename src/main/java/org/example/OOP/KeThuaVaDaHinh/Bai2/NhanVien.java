package org.example.OOP.KeThuaVaDaHinh.Bai2;

public abstract class NhanVien {
    protected String hoTen;
    protected String diaChi;
    protected String soDienThoai;
    protected String email;
    protected String ngaySinh;

    public NhanVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public NhanVien(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.ngaySinh = ngaySinh;
    }

    public abstract double tinhLuong();

    public void hienThiThongTin() {
        System.out.printf("Họ tên: %s\n" +
                "Địa chỉ: %s\n" +
                "Số điện thoại: %s\n" +
                "Email: %s\n" +
                "Ngày sinh: %s\n" +
                "Lương: %,.2fVND\n", hoTen, diaChi, soDienThoai, email, ngaySinh, tinhLuong());
    }
}
