package com.rupali.Day47;

import java.util.Arrays;

public class SelectionSortPrint {
    public static void main(String[] args) {
        int[] arr = {21, 43, 65, 12, 5, 54, 14};
        System.out.println("Original Array : " + Arrays.toString(arr));
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
