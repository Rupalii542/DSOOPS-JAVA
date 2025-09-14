package com.rupali.Day39;

import java.util.Scanner;

public class Rect_star {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();

        for(int var3 = 0; var3 < var2; ++var3) {
            for(int var4 = 0; var4 < var2; ++var4) {
                System.out.print("* ");
            }

            System.out.println();
        }

        var1.close();
    }
}
