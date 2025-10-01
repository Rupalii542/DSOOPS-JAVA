package com.rupali.Day48;
import java.util.Arrays;
public class QuickSort_Print {
    public static void main(String[] args) {
        int arr[] = {45, 12, 78, 34, 23, 90, 11, 56};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex, end);
    }
    private static int partition(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }
}