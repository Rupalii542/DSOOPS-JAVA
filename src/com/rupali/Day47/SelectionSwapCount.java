package com.rupali.Day47;

import java.util.Arrays;

public class SelectionSwapCount {
    public static void main(String args[]){
        int arr[]={21,53,75,31,57,23,46,13,56,26};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                count++;
            }
        }


        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
