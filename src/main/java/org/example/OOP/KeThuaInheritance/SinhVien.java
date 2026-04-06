package org.example.OOP.KeThuaInheritance;

public class SinhVien {
    protected String hoTen;
    protected String ngaySinh;
    protected String noiSinh;
    protected boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String ngaySinh, String noiSinh, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return
                "Họ tên: '" + hoTen + '\'' +
                ", ngày sinh: '" + ngaySinh + '\'' +
                ", nơi sinh: '" + noiSinh + '\'' +
                ", giới tính" + gioiTinh +
                '\n';
    }
}
