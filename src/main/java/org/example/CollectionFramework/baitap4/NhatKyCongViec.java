package org.example.CollectionFramework.baitap4;

import java.util.LinkedHashMap;
import java.util.Map;

public class NhatKyCongViec {
    private LinkedHashMap<String, CongViec> danhSach = new LinkedHashMap<>();

    // ===== Thêm công việc =====
    public void themCongViec(String ma, String noiDung) {
        CongViec cv = new CongViec(ma, noiDung);
        danhSach.put(ma, cv);
    }

    // ===== Hiển thị =====
    public void hienThi() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.println("Danh sách công việc:");
        for (Map.Entry<String, CongViec> entry : danhSach.entrySet()) {
            System.out.println("- " + entry.getValue());
        }
    }

    // ===== Cập nhật =====
    public boolean capNhat(String ma, String noiDungMoi) {
        if (danhSach.containsKey(ma)) {
            danhSach.get(ma).setNoiDung(noiDungMoi);
            return true;
        }
        return false;
    }

    // ===== Xóa =====
    public boolean xoa(String ma) {
        if (danhSach.containsKey(ma)) {
            danhSach.remove(ma);
            return true;
        }
        return false;
    }
}
