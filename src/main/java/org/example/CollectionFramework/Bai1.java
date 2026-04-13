package org.example.CollectionFramework;

import java.util.*;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    static Map<String, List<String>> schedule = new HashMap<>();

    public static void main(String[] args) {
        Map<String, List<String>> schedule = new LinkedHashMap<>();

        inputSchedule(schedule);
        showSchedule(schedule);
        showDuplicateSubjects(schedule);
    }

    // ===== 1. Nhập dữ liệu =====
    public static void inputSchedule(Map<String, List<String>> schedule) {
        while (true) {
            System.out.print("Nhập ngày (Thứ 2 - Thứ 7, hoặc 'thoat'): ");
            String day = sc.nextLine();

            if (day.equalsIgnoreCase("thoat") || day.equalsIgnoreCase("thoát")) {
                break;
            }

            System.out.print("Nhập tên môn học: ");
            String subject = sc.nextLine();

            schedule.putIfAbsent(day, new ArrayList<>());
            schedule.get(day).add(subject);
        }
    }

    // ===== 2. Hiển thị =====
    public static void showSchedule(Map<String, List<String>> schedule) {
        System.out.println("\nThời khóa biểu cả tuần:");

        for (String day : schedule.keySet()) {
            System.out.println(day + ": " + schedule.get(day));
        }
    }

    // ===== 3. Tìm môn trùng =====
    public static void showDuplicateSubjects(Map<String, List<String>> schedule) {
        Map<String, Integer> countMap = countSubjects(schedule);

        System.out.println("\nMôn học xuất hiện nhiều hơn 1 ngày:");
        boolean found = false;

        for (String subject : countMap.keySet()) {
            if (countMap.get(subject) > 1) {
                System.out.println("- " + subject);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có môn nào bị trùng");
        }
    }

    // ===== 4. Hàm phụ: đếm số lần xuất hiện =====
    public static Map<String, Integer> countSubjects(Map<String, List<String>> schedule) {
        Map<String, Integer> countMap = new HashMap<>();

        for (List<String> subjects : schedule.values()) {
            for (String subject : subjects) {
                countMap.put(subject, countMap.getOrDefault(subject, 0) + 1);
            }
        }

        return countMap;
    }
}

