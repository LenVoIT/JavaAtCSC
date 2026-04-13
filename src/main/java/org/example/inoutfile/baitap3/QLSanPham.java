package org.example.inoutfile.baitap3;

import java.io.*;
import java.util.ArrayList;

public class QLSanPham {
    private final String FILE_NAME = "sanpham.dat";

    // ===== GHI ĐÈ =====
    public void ghiFile(ArrayList<SanPham> list) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(list);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }

    // ===== ĐỌC FILE =====
    public ArrayList<SanPham> docFile() {
        ArrayList<SanPham> list = new ArrayList<>();

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            list = (ArrayList<SanPham>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File chưa tồn tại, tạo mới.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc file!");
        }

        return list;
    }

    // ===== HIỂN THỊ =====
    public void hienThi(ArrayList<SanPham> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.printf("%-10s %-20s %-10s %-20s\n",
                "Mã", "Tên", "Giá", "Nhà cung cấp");

        for (SanPham sp : list) {
            sp.hienThiThongTin();
        }
    }

    // ===== TÌM THEO MÃ =====
    public SanPham timTheoMa(ArrayList<SanPham> list, String ma) {
        for (SanPham sp : list) {
            if (sp.getMa().equalsIgnoreCase(ma)) {
                return sp;
            }
        }
        return null;
    }

    // ===== XÓA =====
    public boolean xoa(ArrayList<SanPham> list, String ma) {
        SanPham sp = timTheoMa(list, ma);
        if (sp != null) {
            list.remove(sp);
            return true;
        }
        return false;
    }
}
