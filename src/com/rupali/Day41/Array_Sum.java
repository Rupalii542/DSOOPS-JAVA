package com.rupali.Day41;

public class Array_Sum {
    public static void main(String args[]){
        int [] arr={12,34,45,56,67};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
