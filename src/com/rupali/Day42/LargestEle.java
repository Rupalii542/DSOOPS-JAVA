package com.rupali.Day42;

public class LargestEle {
    public static void main(String args[]){
        int  [] [] arr={{1,12,3}, {4,5,6},{7,8,9}};
        for(int row=0;row<arr.length;row++){
            int max=arr[row][0];
            for(int col=0;col<arr[row].length;col++){
                if(max<arr[row][col]) {
                    max = arr[row][col];
                }
            }
            System.out.println(max);
        }

    }
}
