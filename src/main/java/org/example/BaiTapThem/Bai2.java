package org.example.BaiTapThem;

public class Bai2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //in đường chéo chính
        System.out.println("=====Đường chéo chính=====");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.printf("%4d ", arr[i][j]);
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
        //tam giác trên đuường chéo chính
        System.out.println("=====Tam giác trên đường chéo chính=====");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j >= i) {
                    System.out.printf("%4d ", arr[i][j]);
                } else {
                    System.out.print("     ");

                }
            }
            System.out.println();
        }
        //đươờng chéo phụ
        System.out.println("=====đường chéo phụ =====");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    System.out.printf("%4d ", arr[i][j]);
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }

        //đường chéo  phụ mảng vuông
        System.out.println("=====tam giác duói đường chéo phụ mảng vuông=====");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i + j >= arr.length - 1){ //arr.length = 4
                    System.out.printf("%4d ", arr[i][j]);
                }else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
        //ziczac dau sac
        System.out.println("=====ziczac dau sac=====");
        int number = 0;
        while(number < (arr.length -1 ) * 2){
            for(int i = 0; i < arr.length;i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i + j == number){
                        System.out.print(arr[i][j] + "    ");
                    }
                }
            }
            System.out.println();
            number++;
        }
        //ziczac dau huyen


    }
}

