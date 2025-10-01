package com.rupali.Day50;
public class ConcatenateTime {
    public static void main(String[] args) {
        long start = System.nanoTime();
        String str = "";
        for (int i = 1; i <= 1000; i++) {
            str += i;
        }
        long end = System.nanoTime();
        System.out.println((end - start));
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            sb.append(i);
        }
        end = System.nanoTime();
        System.out.println((end - start));
    }
    }
