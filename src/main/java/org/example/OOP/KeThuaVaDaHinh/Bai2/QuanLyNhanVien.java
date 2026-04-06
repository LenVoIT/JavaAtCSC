package org.example.OOP.KeThuaVaDaHinh.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void khoiTaoNhanVien() {
        NhanVienFullTime nhanVienFullTime1 = new NhanVienFullTime("Full time1", "Quận 7", "0777824398", "fulltime1@gmail.com",
                "10/02/2000", 8000000, 1000000);
        NhanVienPartTime nhanVienPartTime1 = new NhanVienPartTime("Part time 1", "Quận 4", "0987654321", "parttime1@gmailcom",
                "2/2/2002", 50000, 208);
        NhanVienThucTap nhanVienThucTap1 = new NhanVienThucTap("Intern 1", "Quận 1", "0789654321", "intern1@gmail.com",
                "24/02/2003", 5000000);
        danhSachNhanVien.add(nhanVienFullTime1);
        danhSachNhanVien.add(nhanVienPartTime1);
        danhSachNhanVien.add(nhanVienThucTap1);
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }

    public void showEmployees() {
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }
//    class ThongTinChung{
//        String ten, dc, sdt, email, ns;
//    }
//    private String input(String message) {
//        System.out.print(message);
//        return sc.nextLine();
//    }
//    private double inputDouble(String message) {
//        System.out.print(message);
//        return sc.nextDouble();
//    }
//    private ThongTinChung nhapThongTinChung() {
//        ThongTinChung tt = new ThongTinChung();
//        tt.ten = input("Full name: ");
//        tt.dc = input("Address: ");
//        tt.sdt = input("Phone: ");
//        tt.email = input("Email: ");
//        tt.ns = input("DOB: ");
//        return tt;
//    }
    public void addEmployee() {
        int choice;
        do {
            System.out.println("1. FullTime");
            System.out.println("2. PartTime");
            System.out.println("3. Intern");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 4){
                break;
            }
            System.out.print("Full name: ");
            String ten = sc.nextLine();

            System.out.print("Address: ");
            String dc = sc.nextLine();

            System.out.print("Phone no.: ");
            String sdt = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("DOB: ");
            String ns = sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Base salary: ");
                    double lcb = sc.nextDouble();
                    System.out.print("Bonus: ");
                    double thuong = sc.nextDouble();
                    sc.nextLine();
                    danhSachNhanVien.add(new NhanVienFullTime(ten, dc, sdt, email, ns, lcb, thuong));
                    break;
                case 2:
                    System.out.print("Hours: ");
                    double gio = sc.nextDouble();
                    System.out.print("Salary/hour: ");
                    double tien = sc.nextDouble();
                    sc.nextLine();
                    danhSachNhanVien.add(new NhanVienPartTime(ten, dc, sdt, email, ns, gio, tien));
                    break;
                case 3:
                    System.out.print("Intern salary: ");
                    double ltt = sc.nextDouble();
                    sc.nextLine();
                    danhSachNhanVien.add(new NhanVienThucTap(ten, dc, sdt, email, ns, ltt));
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        } while (choice != 4);

    }


    public void totalSalary() {
        double sum = 0;
        for (NhanVien nv : danhSachNhanVien) {
            sum += nv.tinhLuong();
        }
        System.out.printf("Total salary: %,.2f VND\n", sum);
    }

    public void findEmployeeByName() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getHoTen().equalsIgnoreCase(name)) {
                nv.hienThiThongTin();
                return;
            }
        }
        System.out.println(name + " does not exist");
    }

    public void maxSalary() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("No employees to show");
            return;
        }

        NhanVien max = danhSachNhanVien.get(0);
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.tinhLuong() > max.tinhLuong()) {
                max = nv;
            }
            System.out.println("Employee with highest salary:");
            max.hienThiThongTin();
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Tổng lương");
            System.out.println("4. Tìm theo tên");
            System.out.println("5. Lương cao nhất");
            System.out.println("6. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> showEmployees();
                case 2 -> addEmployee();
                case 3 -> totalSalary();
                case 4 -> findEmployeeByName();
                case 5 -> maxSalary();
                case 6 -> System.out.println("Thoát...");
                default -> System.out.println("Sai!");
            }

        } while (choice != 6);
    }
}

