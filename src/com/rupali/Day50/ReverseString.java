package com.rupali.Day50;

import java.util.Scanner;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
        sc.close();
    }
}
