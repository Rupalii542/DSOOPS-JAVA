package com.rupali.Day41;
import java.util.Arrays;
public class Insert_in_Array {
    public static  void main(String args[]){
        int [] arr={10,20,30,40,50,0};
        int n=5;
        int num=60;
        int pos=2;
        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=num;
        n++;
        System.out.println(Arrays.toString(arr));
    }
}