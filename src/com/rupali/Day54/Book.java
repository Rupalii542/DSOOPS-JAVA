package com.rupali.Day54;

class Book {
    String title;
    String author;
    Book(String t, String a) {
        title = t;
        author = a;
    }
    Book(Book b) {
        title = b.title;
        author = b.author;
    }
    public static void main(String[] args) {
        Book b1 = new Book("Python- oxford" , "Reema Thareja");
        Book b2 = new Book(b1);
        System.out.println(b1.title + " , " + b1.author);
        System.out.println(b2.title + " , " + b2.author);
    }
}
