package org.example.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        // ===== 1. Nhập danh sách độc giả =====
        System.out.println("Nhập tên đọc giả mượn sách (rỗng để dừng):");
        while (true) {
            System.out.print("Tên đọc giả: ");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                break; // dừng khi nhập rỗng
            }

            queue.offer(name); // thêm vào cuối hàng đợi
        }

        // ===== 2. Nhập số lượng sách =====
        System.out.print("\nNhập số lượng sách sắp về: ");
        int soSach = sc.nextInt();

        // ===== 3. Giao sách =====
        System.out.println("\nDanh sách giao sách:");
        int count = 0;

        while (!queue.isEmpty() && count < soSach) {
            String nguoiNhan = queue.poll(); // lấy và xóa đầu hàng
            System.out.println("Giao sách cho: " + nguoiNhan);
            count++;
        }

        // ===== 4. Danh sách còn lại =====
        if (queue.isEmpty()) {
            System.out.println("\nKhông còn ai chờ.");
        } else {
            System.out.println("\nDanh sách chờ còn lại:");
            for (String name : queue) {
                System.out.println("- " + name);
            }
        }
    }
}
