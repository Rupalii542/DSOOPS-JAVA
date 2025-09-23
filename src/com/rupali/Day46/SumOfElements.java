package com.rupali.Day46;
public class SumOfElements {
    public static void main(String args[]){
        int sum=0;
        int [] arr={12,34,54,57,86,42};
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}