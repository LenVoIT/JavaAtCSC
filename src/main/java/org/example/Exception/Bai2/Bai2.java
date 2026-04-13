//package org.example.Exception.Bai2;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Bai2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            try {
//
//                System.out.println("=====Danh sách học viên=====");
//                System.out.println("Mã HV\t Tên HV\t\t Môn học\t Điểm");
//
//                for (int i = 0; i < soLuongHV; i++) {
//                    System.out.println(String.format(maHV + "\t" + tenHV ))
//                }
//                break;
//            } catch (InputMismatchException input) {
//                System.out.println("Nhập sai kiểu dữ liệu!!!!");
//            } catch (IllegalArgumentException illegal) {
//                System.out.println(illegal.getMessage());
//            }
//        }
//    }
//    public static HocVien nhapThongTinHV(Scanner sc){
//        System.out.println("Nhập số lượng học viên: ");
//        int soLuongHV = sc.nextInt();
//        for (int i = 0; i < soLuongHV; i++) {
//            System.out.println("===Nhập thông tin học viên thứ " + (i + 1) + "===");
//            System.out.println("Mã HV: ");
//            maHV = sc.nextLine();
//            System.out.println("Tên HV: ");
//            tenHV = sc.nextLine();
//            System.out.println("Môn học: ");
//            monHoc = sc.nextLine();
//            System.out.println("Điểm: ");
//            diem = sc.nextDouble();
//            kiemTraDuLieuNhap(soLuongHV, diem);
//        }
////        if(soLuongHV < 0){
////            throw new IllegalArgumentException("Dữ liệu không được phép là số âm");
////        }
////        if(diem < 0 || diem > 10){
////            throw new IllegalArgumentException("Điểm phải trong khoảng 0 -> 10 !!!!");
////        }
//    }
//}
