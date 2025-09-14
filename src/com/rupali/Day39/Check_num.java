package com.rupali.Day39;
import java.util.Scanner;
public class Check_num{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 5) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
        scanner.close();
    }
}
