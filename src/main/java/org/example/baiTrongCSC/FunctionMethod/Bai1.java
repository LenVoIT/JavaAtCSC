package org.example.baiTrongCSC.FunctionMethod;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n + " is prime");
        }else {
            System.out.println(n + " is not prime");
        }

        printPrimeFrom1toLOEn(n);

        int number=12345;
        while(number != 0){
            int seperatedNum = number % 10;
            if(isPrime(seperatedNum)){
                System.out.println(seperatedNum);
            }
            number /= 10;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeFrom1toLOEn(int n){
        System.out.println("Prime numbers from 1 to " + n + " are: ");
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }

        }
    }
}
