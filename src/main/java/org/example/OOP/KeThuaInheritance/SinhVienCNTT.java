package org.example.OOP.KeThuaInheritance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SinhVienCNTT extends SinhVien{
    private String[] kyNangLapTrinh;

    public SinhVienCNTT() {
    }

    public SinhVienCNTT(String hoTen, String ngaySinh, String noiSinh, boolean gioiTinh, String[] kyNangLapTrinh) {
        super(hoTen, ngaySinh, noiSinh, gioiTinh);
        this.kyNangLapTrinh = kyNangLapTrinh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ky nang lap trinh: " + Arrays.toString(kyNangLapTrinh);
    }
}
