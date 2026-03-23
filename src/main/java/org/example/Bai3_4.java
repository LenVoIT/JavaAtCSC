package org.example;

import java.util.Scanner;

public class Bai3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mật khẩu: ");
        String s = sc.nextLine();

        String specialChars = "!@#$%^&*";
        int upperCase = 0;
        int specialCharacter = 0;
        int lowerCase = 0;
        int digit = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(Character.isUpperCase(c)){
                    upperCase++;
                } else if (Character.isLowerCase(c)) {
                    lowerCase++;
                } else if (Character.isDigit(c)) {
                    digit++;                    
                } else if (specialChars.contains(String.valueOf(c))) {
                    specialCharacter++;
                }
            }
            if(s.length() < 8){
                System.out.println("Không đủ số lượng ký tự tối thiểu");
            }else{
                if(upperCase >= 1 && lowerCase >= 1 && digit >= 1 && specialCharacter >= 1){
                    System.out.println("Mật khẩu siêu cấp vip pro");
                }else {
                    System.out.println("Mật khẩu yếu");
                }
            }

    }
}
