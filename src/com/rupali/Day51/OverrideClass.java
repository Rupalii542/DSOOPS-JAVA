package com.rupali.Day51;
public class OverrideClass {
    private String name;
    private int id;
    private String deptt;
    public OverrideClass(String name, int id, String deptt) {
        this.name = name;
        this.id = id;
        this.deptt= deptt;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Department: " + deptt;
    }
    public static void main(String[] args) {
        OverrideClass emp = new OverrideClass("Rupali Mangla", 702, "CSE");
        System.out.println(emp);
    }
}