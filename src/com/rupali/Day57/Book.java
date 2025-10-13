package com.rupali.Day57;
public class Book {
    String author;
    String name;
    static String seller="ESPB";

    Book(String author, String name){
        this.author=author;
        this.name=name;
    }



    public static void main(String[] args) {
        Book b1=new Book("Harry Potter" , "Harryyy");
        System.out.println("Author : " + b1.author + "," + "Book Name : " + b1.name + "," + "seller : " + seller);
    }
}

