package com.rupali.Day37;

public class Operators {
    public static void main(String[] var0) {
        int var1 = 12;
        System.out.println(var1);
        var1 += 10;
        System.out.println(var1);
        var1 -= 2;
        System.out.println(var1);
        var1 *= 2;
        System.out.println(var1);
        var1 /= 2;
        System.out.println(var1);
        var1 %= 2;
        System.out.println(var1);
        byte var2 = 20;
        byte var3 = 30;
        if (var2 == var3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (var2 != var3) {
            System.out.println("Not Equal");
        } else {
            System.out.println("Equal");
        }

        if (var2 > var3) {
            System.out.println("x is greater");
        } else {
            System.out.println("Not");
        }

        if (var2 < var3) {
            System.out.println("y is greater");
        } else {
            System.out.println("Not");
        }

        if (var2 >= var3) {
            System.out.println("x is greater and Equal");
        } else {
            System.out.println("NO");
        }

        if (var2 <= var3) {
            System.out.println("y is greater and Equal");
        } else {
            System.out.println("NO");
        }

        boolean var4 = true;
        boolean var5 = false;
        if (var4 && var5) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        if (!var4 && !var5) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        System.out.println("p = " + !var4);
        System.out.println("q = " + !var5);
        byte var6 = 15;
        byte var7 = 25;
        byte var8 = var6 > var7 ? var6 : var7;
        System.out.println(var8);
        String var9 = var6 % 2 == 0 ? "Even" : "Odd";
        System.out.println("num1 is " + var9);
    }
}
