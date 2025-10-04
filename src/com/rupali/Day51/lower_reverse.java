package com.rupali.Day51;

public class lower_reverse {
    public static void main(String[] args) {
        String str="RUPALII";
        String st=str.toLowerCase();
        StringBuilder sb=new StringBuilder(st);
        String pr=sb.reverse().toString();
        System.out.println(pr);
    }
}
