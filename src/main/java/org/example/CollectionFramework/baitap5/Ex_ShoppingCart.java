package org.example.CollectionFramework.baitap5;

import java.util.Scanner;

public class Ex_ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;

        do {
            System.out.println("\n===== MENU GIỎ HÀNG =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm theo vị trí");
            System.out.println("3. Thay thế sản phẩm");
            System.out.println("4. Hiển thị giỏ hàng");
            System.out.println("5. Đếm số sản phẩm");
            System.out.println("6. Tìm sản phẩm theo tên");
            System.out.println("7. Tổng giá trị giỏ hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = sc.nextDouble();
                    cart.addProduct(name, price);
                    break;

                case 2:
                    System.out.print("Nhập vị trí cần xóa (bắt đầu từ 0): ");
                    int indexDel = sc.nextInt();
                    if (cart.removeProduct(indexDel)) {
                        System.out.println("Xóa thành công.");
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;

                case 3:
                    System.out.print("Nhập vị trí cần thay (bắt đầu từ 0): ");
                    int indexUp = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tên sản phẩm mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Giá sản phẩm mới: ");
                    double newPrice = sc.nextDouble();

                    if (cart.updateProduct(indexUp, newName, newPrice)) {
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;

                case 4:
                    cart.displayCart();
                    break;

                case 5:
                    System.out.println("Số sản phẩm: " + cart.count());
                    break;

                case 6:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    cart.search(keyword);
                    break;

                case 7:
                    System.out.println("Tổng tiền: " + cart.totalPrice() + " VND");
                    break;

                case 0:
                    System.out.println("Đang thoát...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);
    }
}
