package com.rupali.Day53;
class Dog {
    String name;
    int age;
    Dog(String n, int a) {
        name = n;
        age = a;
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", 3);
        Dog d2 = new Dog("Tarzn", 5);
        System.out.println(d1.name + " , " + d1.age);
        System.out.println(d2.name + " , " + d2.age);
    }
}
