package org.example.baiTrongCSC.CauTrucLap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = sc.nextLine();
        int isLetter = 0;
        int isDigit = 0;
        int isWhitespace = 0;
        int isSpecialChars = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(Character.isLetter(arr[i])){
                isLetter++;
            }else if(Character.isDigit(arr[i])){
                isDigit++;
            } else if (Character.isWhitespace(arr[i])) {
                isWhitespace++;
            } else {
                isSpecialChars++;
            }
        }
        System.out.println("Inputted String has: \n" + isLetter + " ký tự chữ cái\n"
                            + isDigit + " ký tự số \n"
                            + isWhitespace + " khoảng trắng \n"
                            +isSpecialChars + " ký tự đặc biệt");
    }
}
