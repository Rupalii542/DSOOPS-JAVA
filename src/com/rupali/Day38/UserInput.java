package com.rupali.Day38;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();
        if (var2 >= 90) {
            System.out.println("Excellent");
        } else if (var2 >= 75) {
            System.out.println("Very Good");
        } else if (var2 >= 50) {
            System.out.println("Good");
        } else if (var2 >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        switch (var2 / 10) {
            case 4:
                System.out.println("Pass");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Fail");
        }

        var1.close();
    }
}
