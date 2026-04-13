package org.example.Exception.Bai2;

public class HocVien {
    private String maHV;
    private String tenHV;
    private String monHoc;
    private double diem;

    public HocVien() {
    }

    public HocVien(String maHV, String tenHV, String monHoc, double diem) {
        this.maHV = maHV;
        this.tenHV = tenHV;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void hienThi() {
        System.out.printf("Mã: %s | Tên: %s | Môn: %s | Điểm: %.2f\n",
                maHV, tenHV, monHoc, diem);
    }
}
