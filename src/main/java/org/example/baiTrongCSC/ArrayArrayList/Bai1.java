package org.example.baiTrongCSC.ArrayArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danhSachThucUong = new ArrayList<>(Arrays.asList(
                "Bạc xỉu đá",
                "Freeze trà xanh",
                "Trà Thạch Vải",
                "Trà Thanh Đào",
                "Cappuccino",
                "Cà Phê Sữa Đá"
        ));
        boolean founded = false;
        System.out.println("Nhập thức uống bạn muốn mua: ");
        String s = sc.nextLine().trim();
        for (String i : danhSachThucUong) {
            if (i.equalsIgnoreCase(s)) {
                founded = true;
                System.out.println("Đã tìm thấy thức uống bạn muốn mua: " + s);
                break;
            }
        }
        if (!founded) {
            System.out.println("Không tìm thấy thức uống bạn muốn mua");
            System.out.println("Bạn có muốn thêm vào menu không (y/n):  ");
            char c = sc.next().toLowerCase().charAt(0);
            if (c == 'y') {
                danhSachThucUong.add(s);
                System.out.println("Đã thêm " + s + " vào menu");
            } else {
                System.out.println("Không thêm thì thôi");
            }
        }
        System.out.println("Menu sau khi thêm:" + danhSachThucUong);

    }

}
