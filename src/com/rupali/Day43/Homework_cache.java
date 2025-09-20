package com.rupali.Day43;
import java.util.Arrays;
import java.util.Scanner;
public class Homework_cache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of cache: ");
        int size = sc.nextInt();
        String[] cache = new String[size];

        System.out.println("Enter number of initial search terms: ");
        int ele = sc.nextInt();

        System.out.println("Enter search terms: ");
        for (int i = 0; i < ele; i++) {
            cache[i] = sc.next();
        }
        System.out.println("Initial Cache: " + Arrays.toString(cache));
        System.out.println("Enter new search term to insert: ");
        String value = sc.next();
        for (int i = size - 1; i > 0; i--) {
            cache[i] = cache[i - 1];
        }
        cache[0] = value;
        System.out.println("Updated Cache: " + Arrays.toString(cache));
        sc.close();
    }
}
