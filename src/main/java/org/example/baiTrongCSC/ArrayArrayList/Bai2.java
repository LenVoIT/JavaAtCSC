package org.example.baiTrongCSC.ArrayArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soSV = 3;
        int soMonHoc = 4;
        double[][] diem = new double[soSV][soMonHoc]; // tạo ra mảng 2 chiều với số hàng là 3(sinh viên) và số
        //cột là 4(môn học)
        //Nhập điểm
        for (int i = 0; i < soSV; i++) {
            System.out.println("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            for (int j = 0; j < soMonHoc; j++) {
                System.out.print("Môn học thứ " + (j + 1) + ": ");
                diem[i][j] = sc.nextDouble();
            }
        }
        //Xuất bảng điểm
        System.out.println("\n===== BẢNG ĐIỂM =====");
        for (int i = 0; i < soSV; i++) {
            System.out.print("Sinh viên " + (i + 1) + ": ");
            for (int j = 0; j < soMonHoc; j++) {
                System.out.print(diem[i][j] + " ");
            }
            System.out.println();
        }
        //tìm sv có điểm cao nhất
        int viTriMax = 0; //sinh viên thứ i
        double maxTB = 0;
        for(int i = 0; i < soSV; i++){ //duyệt hàng tìm sinh viên
            double tongDiem = 0; // biến luu tổng điểm của 1 sinh viên
            for(int j = 0; j< soMonHoc; j++){
                tongDiem += diem[i][j];
            }
            double trungBinhCong = tongDiem / soMonHoc;
            if(i == 0 || trungBinhCong > maxTB){
                maxTB = trungBinhCong;
                viTriMax = i;
            }
            System.out.printf("Điểm trung bình sinh viên %d là:  %.2f\n", (i+1), trungBinhCong);
        }
        System.out.printf("Sinh viên %d có điểm trung bình cao nhất là:  %.2f\n", (viTriMax + 1), maxTB);

    }
}
