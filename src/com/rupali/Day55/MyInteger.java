package com.rupali.Day55;

class MyInteger {
    int value;
    MyInteger(int v) {
        value = v;
    }
    boolean isEven() {
        return value % 2 == 0;
    }
    boolean isOdd() {
        return value % 2 != 0;
    }
    boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(7);
        MyInteger n2 = new MyInteger(10);
        System.out.println(n1.value + " is even? " + n1.isEven());
        System.out.println(n1.value + " is odd? " + n1.isOdd());
        System.out.println(n1.value + " is prime? " + n1.isPrime());
        System.out.println(n2.value + " is even? " + n2.isEven());
        System.out.println(n2.value + " is odd? " + n2.isOdd());
        System.out.println(n2.value + " is prime? " + n2.isPrime());
    }
}
