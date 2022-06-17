package com.m3.c242;

public class SummativeSums {
    public static void main(String[] args) {
        int[] arr1 = {1, 90, -33, -55, 67, -16, 28, -55, 15},
                arr2 = {999, -60, -77, 14, 160, 301},
                arr3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                        140, 150, 160, 170, 180, 190, 200, -99};

        System.out.printf("#1 Array Sum: %d\n" +
                        "#2 Array Sum: %d\n" +
                        "#3 Array Sum: %d\n",
                sumArray(arr1),
                sumArray(arr2),
                sumArray(arr3));
    }

    public static int sumArray(int[] arr) {
        int res = 0;
//        return Arrays.stream(arr).sum();
        for (int i : arr)
            res += i;
        return res;
    }
}
