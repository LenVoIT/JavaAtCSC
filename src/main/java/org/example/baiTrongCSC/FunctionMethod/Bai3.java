package org.example.baiTrongCSC.FunctionMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập câu: ");
        String cau = sc.nextLine().toLowerCase();
        ArrayList<String> danhSachTu = tachTu(cau);
        ArrayList<String> danhSachTuDuyNhat = timTuDuyNhat(danhSachTu);
        System.out.println("Các từ duy nhất: ");
        hienThiTu(danhSachTuDuyNhat);
    }

    //tách từ
    public static ArrayList<String> tachTu(String cau) {
        String[] tach = cau.split("\\s+"); // tách theo khoảng trắng
        ArrayList<String> danhSach = new ArrayList<>();
        for (String tu : tach) {
            // Xóa dấu câu nhưng giữ dấu tiếng Việt
            tu = tu.replaceAll("[.,?!;:\"']", "");
            if (!tu.isEmpty()) {
                danhSach.add(tu.toLowerCase()); // chuyển về chữ thường để so sánh
            }
        }
        return danhSach;
    }
    //tìm từ duy nhất
    public static ArrayList<String> timTuDuyNhat(ArrayList<String> tachTu){
        ArrayList<String> ketQua = new ArrayList<>(); // mảng dùng để lưu trữ kết quả
        for(int i = 0; i < tachTu.size();i++){
            int dem = 0;
            String tu = tachTu.get(i); // lấy từ trong mảng tachTu theo vị trí i để so sánh
            for(int j = 0; j < tachTu.size();j++){
                if (tu.equals(tachTu.get(j))){
                    dem++;
                }
            }
            if(dem == 1){
                ketQua.add(tu);
            }
        }
        return ketQua;
    }
    //hiển thị từ
    public static void hienThiTu(ArrayList<String> tachTu){
        for(String tu : tachTu){
//            System.out.print(String.join(",", tachTu));
            System.out.print(tu + " ");
        }
    }
}
