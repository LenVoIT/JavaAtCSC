package org.example.inoutfile.baitap3;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String ma;
    private String ten;
    private double donGia;
    private String nhaCungCap;

    public SanPham(String ma, String ten, double donGia, String nhaCungCap) {
        this.ma = ma;
        this.ten = ten;
        setDonGia(donGia);
        this.nhaCungCap = nhaCungCap;
    }

    public String getMa() { return ma; }
    public String getTen() { return ten; }
    public double getDonGia() { return donGia; }
    public String getNhaCungCap() { return nhaCungCap; }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDonGia(double donGia) {
        if (donGia < 0) {
            throw new IllegalArgumentException("Đơn giá phải >= 0");
        }
        this.donGia = donGia;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public void hienThiThongTin() {
        System.out.printf("%-10s %-20s %-10.2f %-20s\n",
                ma, ten, donGia, nhaCungCap);
    }
}
