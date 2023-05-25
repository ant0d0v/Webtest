package org.example;

public class HW6 {
    public static void main(String[] args) {
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum);
//
//        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int min = array1[0];
//        for (int i = 0; i < array1.length; i++) {
//            if (min > array1[i]) {
//                min = array1[i];
//            }
//        }
//        System.out.println(min);
//
//        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int max = array2[0];
//        for (int i = 0; i < array2.length; i++) {
//            if (max < array1[i]) {
//                max = array1[i];
//            }
//        }
//        System.out.println(max);
//
//        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sre = 0;
//        for (int i = 0; i < array3.length; i++) {
//            sre = sre + array3[i];
//        }
//        sre = sre / array3.length;
//        System.out.println(sre);
//
//        int sum1 = 0;
//        int[][] array4 = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};
//        for (int i = 0; i < array4.length; i++) {
//
//            for (int j = 0; j < array4[i].length; j++){
//                sum1 = sum1 + array4[i][j];
//
//             }
//            System.out.println(sum1);
//        }
//
//        int[][] array5 = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};
//        int max2= array5[0][0];
//        for (int i = 0; i < array5.length; i++) {
//
//            for (int j = 0; j < array5[i].length; j++){
//                if(max2 < array5[i][j]){
//                    max2 = array5[i][j];
//                }
//                System.out.println(max2);
//            }
//        }
        int[][] array6 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        int count = 0;
        for (int i = 0; i < array6.length; i++) {

            for (int j = 0; j < array6[i].length; j++){
                count = count + 1 ;

            }
            System.out.println(count);
        }
    }
}


