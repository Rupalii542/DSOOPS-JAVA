package com.rupali.Day54;

class Point {
    int x;
    int y;
    Point(int a, int b) {
        x = a;
        y = b;
    }
    Point(Point p) {
        x = p.x;
        y = p.y;
    }
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(p1);
        System.out.println(p1.x + ", " + p1.y);
        System.out.println(p2.x + ", " + p2.y);
    }
}
