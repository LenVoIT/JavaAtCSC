package org.example.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        chiaTien();
    }
    public static void kiemTraDuLieuNhapKhongAm(double money, int people) throws IllegalArgumentException,ArithmeticException{
        if (money < 0 || people < 0) {
            throw new IllegalArgumentException("Dữ liệu không được âm!!!!");
        }
        if (people == 0) {
            throw new ArithmeticException("Lỗi chia hết cho 0");
        }
    }
    public static void chiaTien() {
        while (true) {
            try {
                System.out.print("Nhập tổng tiền hóa đơn: ");
                double money = sc.nextDouble();
                System.out.print("Nhập số người: ");
                int people = sc.nextInt();
                kiemTraDuLieuNhapKhongAm(money,people);
                double ketQua = money / people;
                System.out.printf("Mỗi người trả: %,.2f \n", ketQua);
                break;
            } catch (InputMismatchException i) {
                System.out.println("Lỗi: nhập sai kiểu dữ liệu !");
                sc.nextLine();
            }
            catch (IllegalArgumentException ill){
                System.out.println(ill.getMessage());
            }catch (ArithmeticException a){
                System.out.println(a.getMessage());
            }
        }
        sc.close();
        System.out.println("End");
    }
}
