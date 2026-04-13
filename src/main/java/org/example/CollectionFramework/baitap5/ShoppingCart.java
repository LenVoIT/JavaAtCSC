package org.example.CollectionFramework.baitap5;

import java.util.LinkedList;

public class ShoppingCart {
    private LinkedList<Product> cart = new LinkedList<>();

    // ===== Khởi tạo sẵn 3 sản phẩm =====
    public ShoppingCart() {
        cart.add(new Product("Đồng hồ casio", 1500000));
        cart.add(new Product("Mắt kính Korea", 1200000));
        cart.add(new Product("Tai nghe bluetooth", 650000));
    }

    // ===== Thêm =====
    public void addProduct(String name, double price) {
        cart.add(new Product(name, price));
    }

    // ===== Xóa theo index =====
    public boolean removeProduct(int index) {
        if (index >= 0 && index < cart.size()) {
            cart.remove(index);
            return true;
        }
        return false;
    }

    // ===== Thay thế =====
    public boolean updateProduct(int index, String name, double price) {
        if (index >= 0 && index < cart.size()) {
            cart.set(index, new Product(name, price));
            return true;
        }
        return false;
    }

    // ===== Hiển thị =====
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Giỏ hàng rỗng.");
            return;
        }

        System.out.println("Giỏ hàng hiện tại:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(i + ". " + cart.get(i));
        }
    }

    // ===== Đếm =====
    public int count() {
        return cart.size();
    }

    // ===== Tìm theo tên =====
    public void search(String keyword) {
        boolean found = false;

        for (Product p : cart) {
            if (p.getProductName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    // ===== Tổng tiền =====
    public double totalPrice() {
        double sum = 0;
        for (Product p : cart) {
            sum += p.getPrice();
        }
        return sum;
    }
}
