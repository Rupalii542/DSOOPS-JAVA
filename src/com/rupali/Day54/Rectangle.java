package com.rupali.Day54;

public class Rectangle {
    int width;
    int height;
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    Rectangle(Rectangle r) {
        width = r.width;
        height = r.height;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(r1);
        System.out.println(r1.width + " , " + r1.height); //width is 10 as not updated
        r1.width = 50;
        System.out.println(r1.width + " , " + r1.height); //width updated to 50
        System.out.println(r2.width + " , " + r2.height);
    }
}