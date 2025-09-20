package com.rupali.Day44;
public class BinarySearch {
    int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, right, target);
    }
    public static void main(String args[]){
        BinarySearch bs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int result = bs.binarySearch(arr, 0, arr.length - 1, target);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("not found");
        }
    }
}
