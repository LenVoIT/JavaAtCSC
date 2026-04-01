package org.example.baiTrongFileZalo.CauTrucLap;

import java.util.Scanner;
//Viết chương trình nhập vào một số nguyên dương n.
// Tính tổng các số nguyên nhỏ hơn hoặc bằng n thỏa ít nhất một trong hai điều kiện:
//        - Cùng chia hết cho 3 và 5.
//        - Chia cho 3 thì dư 2 và chia cho 5 thì dư 3.
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        boolean isFirst = true;
        int total = 0;
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0 || i % 3 == 2 && i % 5 == 3){
                if(!isFirst){
                    System.out.print("+");
                }
                System.out.print(i);
                total += i;
                isFirst = false;
            }
        }
        System.out.print("= " + total);

    }
}
