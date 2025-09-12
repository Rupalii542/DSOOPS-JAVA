package com.rupali.Day39;

public class Sum_Even {
    public static void main(String args[]){
        int n = 10;
        int sum = 0, i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
