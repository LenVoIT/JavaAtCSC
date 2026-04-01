package org.example.BaiTapThem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 2, 99, 7, 3, 6};

        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        //tối ưu k lần => ví dụ mảng có chiều dài = 6 và muốn dịch k = 8 lần => 8 % 6 = 2 lần

        //DỊCH TRÁI
        System.out.print("Nhập số lần muốn dịch chuyển mảng: ");
        int k = sc.nextInt();
        int n = arr.length;
        k = k % n;
        int[] result = new int[n]; // tạo mảng mới cùng kích thước với mảng ban đầu
        for (int i = k; i < n; i++) {
            result[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            result[n - k + i] = arr[i];
        }

        System.out.println("Mảng sau khi dịch trái " + k + " lần là: " + Arrays.toString(result));


        //DỊCH PHẢI k lần
        int[] arr2 = {10, 2, 99, 7, 3, 6};
        System.out.print("Nhập số lần muốn dịch chuyển mảng sang phải: ");
        int k2 = sc.nextInt();
        int n2 = arr2.length;
        k2 = k2 % n2;
        int[] result2 = new int[n2];
        for(int i = n2 - k2; i < n2 ; i++){
            result2[i - (n - k)] = arr2[i]; //Xử lý phần sau từ vị trí i để đưa lên đầu
        }
        for(int i = 0; i<n-k;i++){ // xử lý phần đầu đưa ra sau
            result2[k + i] = arr2[i];
        }
        System.out.println("Mảng sau khi dịch trái " + k + " lần là: " + Arrays.toString(result2));

    }

}

