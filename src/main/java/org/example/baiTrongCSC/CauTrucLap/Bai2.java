package org.example.baiTrongCSC.CauTrucLap;

import java.util.Scanner;

//Yêu cầu: Nhập vào một số x kiểm tra xem x có phải là số nguyên tố hay không.
//        (Gợi ý: Số nguyên tố là số chỉ chia hết cho 1 và chính nó)
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số x: ");
        int x = sc.nextInt();
        if (x < 2) {
            System.out.print(x + " không phải là số nguyên tố");
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print(x + " là số nguyên tố");
        }else {
            System.out.print(x + " không phải là số nguyên tố");
        }
    }

}
