package com.rupali.Day55;

public class Vehicle {
    String brand;
    public Vehicle(String brand){
        this.brand=brand;
    }


    //print vehicle100
    @Override
    public String toString() {
        return "Vehicle100";
    }


    public static void main(String[] args) {
        Vehicle v=new Vehicle("BMW");
        System.out.println(v);  //print reference of object
//      System.out.println(v.toString());
    }
}
