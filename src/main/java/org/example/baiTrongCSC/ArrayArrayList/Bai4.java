package org.example.baiTrongCSC.ArrayArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //danh sách sản phẩm
        String[] products = {"Sữa tắm", "Dầu gội", "Dầu xả", "Xà phòng tắm", "Kem đánh răng"};
        //danh sách giá sản phẩm
        int[] productPrices = {75000, 135000, 128000, 18000, 25000};

        //giỏ hàng
        ArrayList<String> productsInCart = new ArrayList<>();
        ArrayList<Integer> productsInCartAmount = new ArrayList<>();
        int soLuong;
        int choice;
        do {
            System.out.println("=========MENU=========");
            for (int i = 0; i < products.length; i++) {
                System.out.print((i + 1) + ". " + products[i] + " - " + productPrices[i] + "\n");
            }
            System.out.println("Bạn chọn mặt hàng số mấy(1-5)(chọn 0 để dừng): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Nhập số lượng: ");
                    soLuong = sc.nextInt();
                    productsInCart.add("Sữa tắm");
                    productsInCartAmount.add(soLuong);
                    break;
//                case 2:
//                    System.out.print("Nhập số lượng: ");
//                    soLuong = sc.nextInt();
//                    productsInCart.add("Dầu gội");
//                    productsInCartAmount.add(soLuong);
//                    break;
//                case 3:
//                    System.out.print("Nhập số lượng: ");
//                    soLuong = sc.nextInt();
//                    productsInCart.add("Dầu xả");
//                    productsInCartAmount.add(soLuong);
//                    break;
//                case 4:
//                    System.out.print("Nhập số lượng: ");
//                    soLuong = sc.nextInt();
//                    productsInCart.add("Xà phòng");
//                    productsInCartAmount.add(soLuong);
//                    break;
//                case 5:
//                    System.out.print("Nhập số lượng: ");
//                    soLuong = sc.nextInt();
//                    productsInCart.add("Kem đánh răng");
//                    productsInCartAmount.add(soLuong);
//                    break;
                case 0:
                    System.out.print("Kết thúc mua hàng... ");
                    break;
                default:
                    System.out.print("Lựa chọn không hợp lệ... ");
            }
        } while (choice != 0);
    }

    public static void printCartDetail(ArrayList<String> productsInCart,
                                       ArrayList<Integer> productsInCartAmount,
                                       String[] products,
                                       int[] productPrices) {
        System.out.println("=========GIỎ HÀNG CỦA BẠN=========");
        if(productsInCart.isEmpty()){
            System.out.println("Giỏ hàng trống!!!");
        }
        int totalPrice = 0;
//        for(int i = 0;)
    }
}
