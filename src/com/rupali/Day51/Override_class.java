package com.rupali.Day51;
public class Override_class {
    private String name;
    private int id;
    private String deptt;
    public Override_class(String name, int id, String deptt) {
        this.name = name;
        this.id = id;
        this.deptt= deptt;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Department: " + deptt;
    }
    public static void main(String[] args) {
        Override_class emp = new Override_class("Rupali Mangla", 702, "CSE");
        System.out.println(emp);
    }
}