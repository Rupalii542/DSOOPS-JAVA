package com.rupali.Day43;
import java.util.Arrays;
import java.util.Scanner;
public class Homework_cache {
    public  static  void main(String args[]){
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of cache: ");
        int size=sc.nextInt();
        String [] cache = new String[size];
        System.out.println("Enter number of elements u want to insert: ");
        int ele=sc.nextInt();
        System.out.println("Enter Data: ");
        for(int i=0;i<size;i++){
            cache [i]=sc.next();
        }
        System.out.println(Arrays.toString(cache));
        for(int i=size-1;i>0;i--){
            cache[i]=cache[i-1];
        }
        System.out.println("Enter new Value: ");
        String value=sc.next();
        cache[0]=value;
        System.out.println(Arrays.toString(cache));
        sc.close();
    }
}