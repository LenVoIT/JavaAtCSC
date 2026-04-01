package org.example.baiTrongCSC.FunctionMethod;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height(m): ");
        double height = sc.nextDouble();
        System.out.print("Input weight(kg): ");
        double weight = sc.nextDouble();
        double bmi = tinhBMI(weight,height);
        String s = danhGiaBMI(bmi);
        System.out.printf("Chỉ số BMI của bạn: %.2f\n",bmi);
        System.out.println("Đánh giá: " + s);
    }
    public static double tinhBMI(double weight, double height){
        return (weight / (height * height));
    }
    public static String danhGiaBMI(double BMI){
        if(BMI < 18.5){
            return "Thiếu cân";
        } else if (BMI >= 18.5 && BMI <= 22.9 ) {
            return "Bình thường";
        } else if (BMI >= 23 && BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
