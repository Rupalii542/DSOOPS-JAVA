package com.rupali.Day47;
import java.util.Arrays;
public class Selection_each_outerPass {
        public static void main(String[] args) {
            int[] arr = {9, 5, 2, 8, 4};
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
                System.out.println(Arrays.toString(arr));
            }
        }
    }
