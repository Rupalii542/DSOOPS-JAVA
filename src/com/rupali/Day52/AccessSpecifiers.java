package com.rupali.Day52;
class Carr {
    private String make;
    public int year;
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
}
public class AccessSpecifiers {
    public static void main(String[] args) {
        Carr c = new Carr();
        c.year = 2022;
        c.setMake("Mahindra");
        System.out.println(c.getMake());
        System.out.println(c.year);
    }
}