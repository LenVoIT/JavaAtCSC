package org.example.baiTrongFileZalo;

import java.util.Scanner;
//Viết chương trình cho nhập một ký tự. Xác định ký tự vừa nhập có phải là chữ
//cái thường hay không? Nếu đúng in lên màn hình chữ cái hoa tương ứng, ngược
//lại in mã ASCII của ký tự vừa nhập.
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một ký tự: ");
        char c = sc.next().charAt(0);
        if(c >= 'a' && c <= 'z'){
            char upperCaseChar = (char)(c-32);
            System.out.println("Chữ in hoa của " + c + " là: " +upperCaseChar);
        }else if(c >= 'A' && c <= 'Z'){
            System.out.println("Mã ASCII của " + c + " là: " + (int)c);
        }
    }
}
