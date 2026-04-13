package org.example.inoutfile.baitap2;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// ===== CUSTOM EXCEPTION =====
class TenRongException extends Exception {
    public TenRongException(String msg) { super(msg); }
}

class EmailKhongHopLeException extends Exception {
    public EmailKhongHopLeException(String msg) { super(msg); }
}

class SoDienThoaiKhongHopLeException extends Exception {
    public SoDienThoaiKhongHopLeException(String msg) { super(msg); }
}

class SoVeKhongHopLeException extends Exception {
    public SoVeKhongHopLeException(String msg) { super(msg); }
}

class NgayKhongHopLeException extends Exception {
    public NgayKhongHopLeException(String msg) { super(msg); }
}

// ===== MAIN =====
public class DangKyMuaVe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String file = "dat_ve.txt";
        String tiepTuc;

        do {
            VeSoThu ve = new VeSoThu();

            // ===== NHẬP =====
            while (true) {
                try {
                    System.out.print("Nhập họ tên: ");
                    ve.setHoTen(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
            }

            while (true) {
                try {
                    System.out.print("Nhập email: ");
                    ve.setEmail(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
            }

            while (true) {
                try {
                    System.out.print("Nhập số điện thoại: ");
                    ve.setSdt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
            }

            while (true) {
                try {
                    System.out.print("Nhập số vé người lớn: ");
                    ve.setVeNguoiLon(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
            }

            while (true) {
                try {
                    System.out.print("Nhập số vé trẻ em: ");
                    ve.setVeTreEm(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
            }

            while (true) {
                try {
                    System.out.print("Nhập ngày tham quan (dd/MM/yyyy): ");
                    LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
                    ve.setNgayThamQuan(date);
                    break;
                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
            }

            // ===== GHI FILE =====
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write(ve.toString());
                bw.newLine();
                System.out.println("Đăng ký thành công!");
            } catch (IOException e) {
                System.out.println("Lỗi ghi file!");
            }

            // ===== HỎI TIẾP =====
            System.out.print("Bạn có muốn đăng ký tiếp không? (y/n): ");
            tiepTuc = sc.nextLine();

        } while (tiepTuc.equalsIgnoreCase("y"));

        // ===== ĐỌC FILE =====
        System.out.println("\nDanh sách vé đã đăng ký:");
        System.out.printf("%-20s %-25s %-12s %-6s %-6s %-12s\n",
                "Họ tên", "Email", "SĐT", "Vé NL", "Vé TE", "Ngày đi");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t");
                System.out.printf("%-20s %-25s %-12s %-6s %-6s %-12s\n",
                        data[0], data[1], data[2], data[3], data[4], data[5]);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file!");
        }
    }
}
