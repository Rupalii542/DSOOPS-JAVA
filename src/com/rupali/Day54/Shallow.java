package com.rupali.Day54;

public class Shallow {
    StringBuilder title;
    Shallow(String t) {
        title = new StringBuilder(t);
    }
    Shallow(Shallow s) {
        title = s.title;
    }
    public static void main(String[] args) {
        Shallow b1 = new Shallow("Java");
        Shallow b2 = new Shallow(b1);
        b2.title.append(" Programming");
        System.out.println(b1.title);
        System.out.println(b2.title);
    }
}
