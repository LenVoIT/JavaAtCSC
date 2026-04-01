package org.example.OOP.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Word> dictionary = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Thêm từ mới");
            System.out.println("2. Xem tất cả");
            System.out.println("3. Tìm nghĩa");
            System.out.println("4. Cập nhật ví dụ");
            System.out.println("5. Xóa từ");
            System.out.println("6. Thoát");
            System.out.print("Chọn chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); //

            switch (choice) {
                case 1:
                    System.out.print("Nhập từ tiếng Anh: ");
                    String en = sc.nextLine();

                    System.out.print("Nhập nghĩa tiếng Việt: ");
                    String vn = sc.nextLine();

                    System.out.print("Nhập ví dụ: ");
                    String ex = sc.nextLine();

                    dictionary.add(new Word(en, vn, ex));
                    System.out.println("Đã thêm từ mới");
                    break;
                case 2:
                    if (dictionary.isEmpty()) {
                        System.out.println("Từ điển trống");
                    } else {
                        for (Word w : dictionary) {
                            System.out.println(w);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tim nghia tieng Viet theo tu tieng Anh:");
                    String s = sc.nextLine();
                    boolean found = false;
                    for (Word w : dictionary) {
                        if (w.getEnglish().equalsIgnoreCase(s)) {
                            System.out.println(w);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(s + " khong co trong tu dien!!!");
                    }
                    break;
                case 4:
                    System.out.println("Nhap tu tieng Anh can cap nhat vi du:");
                    String findWord = sc.nextLine();
                    boolean found2 = false;
                    for (Word w : dictionary) {
                        if (w.getEnglish().equalsIgnoreCase(findWord)) {
                            System.out.println("Nhap vi du moi:");
                            String updateExample = sc.nextLine();
                            w.setExample(updateExample);
                            found2 = true;
                            break;
                        }
                    }
                    if (found2) {
                        System.out.println("Cap nhat thanh cong:");
                    } else {
                        System.out.println(findWord + " khong co trong tu dien!!!");
                    }
                    break;
                case 5:
                    System.out.println("Nhap tu tieng Anh muon xoa: ");
                    String deleteWord = sc.nextLine();
                    boolean foundAndDelete = false;
                    for (int i = 0; i < dictionary.size(); i++) {
                        if (dictionary.get(i).getEnglish().equalsIgnoreCase(deleteWord)) {
                            dictionary.remove(i);
                            foundAndDelete = true;
                            break;

                        }
                    }
                    if (foundAndDelete) {
                        System.out.println("Xoa thanh cong:");
                    } else {
                        System.out.println(deleteWord + " khong co trong tu dien de xoa!!!");
                    }
                    break;
                default:
                    System.out.println("Chon khong hop le, chon lai!!!");

            }
        } while (choice != 6);
    }
}
