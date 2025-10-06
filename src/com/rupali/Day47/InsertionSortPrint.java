package com.rupali.Day47;

import java.util.Arrays;

public class InsertionSortPrint {
    public static void main(String args[]){
        int [] arr= {20, 50, 40, 10, 30};
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
