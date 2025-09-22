package com.rupali.Day45;
public class LinearSearch {
    public static void main(String args[]){
        int [] arr={1,2,4,7,4,2,75,23,86};
        int target=75;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                System.out.println(i);
            }
        }
    }
}