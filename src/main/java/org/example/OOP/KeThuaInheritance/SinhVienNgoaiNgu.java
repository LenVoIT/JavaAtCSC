package org.example.OOP.KeThuaInheritance;

import java.util.Arrays;

public class SinhVienNgoaiNgu extends SinhVien{
    private String[] ngonNguPhu;

    public SinhVienNgoaiNgu() {
    }

    public SinhVienNgoaiNgu(String hoTen, String ngaySinh, String noiSinh, boolean gioiTinh, String[] ngonNguPhu) {
        super(hoTen, ngaySinh, noiSinh, gioiTinh);
        this.ngonNguPhu = ngonNguPhu;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ngon ngu phu: " + Arrays.toString(ngonNguPhu);
    }
}
