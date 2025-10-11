package com.rupali.Day53;

class LibraryBook {
    String title;
    String author;
    int pages;
    LibraryBook() {
        title = "";
        author = "";
        pages = 0;
    }
    LibraryBook(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }
    LibraryBook(LibraryBook b) {
        title = b.title;
        author = b.author;
        pages = b.pages;
    }
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook("Python - Oxford", "Reema Thareja", 250);
        LibraryBook b3 = new LibraryBook(b2);
        System.out.println("Book 1: " + b1.title + ", " + b1.author + ", " + b1.pages);
        System.out.println("Book 2: " + b2.title + ", " + b2.author + ", " + b2.pages);
        System.out.println("Book 3: " + b3.title + ", " + b3.author + ", " + b3.pages);
    }
}
