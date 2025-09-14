package com.rupali.Day39;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();

        for(int var3 = 1; var3 <= var2; ++var3) {
            for(int var4 = 1; var4 <= var2 - var3; ++var4) {
                System.out.print(" ");
            }

            for(int var5 = 1; var5 <= var3; ++var5) {
                System.out.print("*");
            }

            System.out.println();
        }

        var1.close();
    }
}
