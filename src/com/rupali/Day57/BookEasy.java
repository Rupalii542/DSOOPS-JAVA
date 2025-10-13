package com.rupali.Day57;

public class BookEasy {
    String title;
    static int totalBooks;

    BookEasy(String title) {
        this.title = title;
        totalBooks++;
    }

    public static void main(String[] args) {

        BookEasy b1 = new BookEasy("Harry Potter");
        System.out.println(b1.title);
        System.out.println("Total Books: " + BookEasy.totalBooks);

        BookEasy b2 = new BookEasy("Martin Luther");
        System.out.println(b2.title);
        System.out.println("Total Books: " + BookEasy.totalBooks);
    }
}
