package com.rupali.Day44;
import java.util.Scanner;
public class factorialRecursion {
    static int facct(int num){
        int fact=1;
        if(num==0 || num==1) {
            return 1;
        }
        return num*facct(num-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(facct(num));
    }
}
