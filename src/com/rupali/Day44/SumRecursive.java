package com.rupali.Day44;
public class SumRecursive {
    public static void main(String[] args) {
        int N = 10;
        int sum = summm(N);
        System.out.println(sum);
    }
    public static int summm(int n) {
        if (n <= 1) {
            return n;
        }
        return n + summm(n - 1);
    }
}
