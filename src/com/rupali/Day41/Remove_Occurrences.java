package com.rupali.Day41;

import java.util.Arrays;

public class Remove_Occurrences {
    public static void main(String args[]){
        int [] arr={1,2,3,4,5,6,7,5,3,1};
        int remove =3;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i])!=remove){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
//        int [] Updated = Arrays.copyOf(arr,j);
//        System.out.println(Arrays.toString(Updated));
        System.out.println("Size : " +j);
    }
}