package com.rupali.Day45;
public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {1, 12, 24, 31, 34, 56, 78, 99};
        int target = 34;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}