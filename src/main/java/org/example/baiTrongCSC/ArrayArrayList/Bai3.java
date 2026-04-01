package org.example.baiTrongCSC.ArrayArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> danhBa = new ArrayList<>();
        nhapDanhBa(danhBa);
        xuatDanhBa(danhBa);
        timLienHe(danhBa);
        xoaLienHe(danhBa);
        xuatDanhBa(danhBa);
    }
    //nhập danh bạ
    public static void nhapDanhBa(ArrayList<String> danhBa){

        System.out.println("==========NHẬP DANH BẠ========== ");
        while(true) {
            System.out.println("Nhập tên(Ngừng khi nhấn Enter): ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break; //ngừng chương trình khi không nhập tên
            }
            System.out.println("Nhập số điện thọại: ");
            String sdt = sc.nextLine();
            danhBa.add(name + "\t: " + sdt);
        }
    }
    //xuất danh bạ
    public static void xuatDanhBa(ArrayList<String> danhBa){
        System.out.println("==========DANH BẠ==========");
        if(danhBa.isEmpty()){
            System.out.println("==========Danh bạ trống==========");
        }
        for (String lienHe : danhBa){
            System.out.println(lienHe);
        }

    }
    //tìm liên hệ
    public static void timLienHe(ArrayList<String> danhBa){
        System.out.println("==========TÌM LIÊN HỆ==========");
        System.out.println("Nhập tên liên hệ cần tìm: ");
        String findName = sc.nextLine();
        boolean isFound = false;
        for(String lienHe : danhBa) {
            if (lienHe.toLowerCase().contains(findName.toLowerCase())) {
                isFound = true;
                System.out.println("Tìm thấy liên hệ \n" + lienHe);
            }
        }
        if(!isFound){
            System.out.println("Không tìm thấy");
        }

    }
    //xóa liên hệ
    public static void xoaLienHe(ArrayList<String> danhBa){
        System.out.println("==========DANH BẠ==========");
        System.out.println("Vui lòng nhập tên muốn xóa: ");
        String deleteInfo = sc.nextLine();
        boolean isDelete = false;
        for(int i =0; i < danhBa.size() ; i++){
            if(danhBa.get(i).toLowerCase().contains(deleteInfo.toLowerCase())){
                danhBa.remove(i);
                isDelete = true;
                //i--;
            }
        }
        if(isDelete){
            System.out.println("Đã xóa liên hệ " + deleteInfo);
        }else {
            System.out.println("Xóa thất bại");
        }

    }
}
