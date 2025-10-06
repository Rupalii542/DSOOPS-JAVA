package com.rupali.Day52;

class Person {
    private String address;
    public void setAddress(String addr) {
        address = addr;
    }
    public void printAddress() {
        System.out.println(address);
    }
}
public class ChangeAddress {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAddress("Model Town");
        p.printAddress();
    }
}
