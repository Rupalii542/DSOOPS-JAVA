package com.rupali.Day55;

public class CountEvenDigits {
    public static void main(String[] args) {
        Integer result=0;
        int [] arr={12,43,685,4256,461};
        for(Integer i=0;i< arr.length;i++){
           int value = Integer .valueOf(arr[i]);
            if(value%2==0){
                result++;
            }
        }
        System.out.println(result);
    }
}