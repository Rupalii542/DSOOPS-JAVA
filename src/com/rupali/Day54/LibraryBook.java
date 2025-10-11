package com.rupali.Day54;

class Author {
    String name;
    String email;
    Author(String n, String e) {
        name = n;
        email = e;
    }
    Author(Author a) {
        name = a.name;
        email = a.email;
    }
}

class LibraryBook {
    String title;
    Author author;
    LibraryBook(String t, Author a) {
        title = t;
        author = a;
    }
    LibraryBook(LibraryBook lb) {
        title = lb.title;
        author = new Author(lb.author);
    }
    public static void main(String[] args) {
        Author a1 = new Author("Paulo Coelho", "paulo@example.com");
        LibraryBook b1 = new LibraryBook("The Alchemist", a1);
        LibraryBook b2 = new LibraryBook(b1);
        b2.author.name = "Changed Name";
        System.out.println(b1.author.name);
        System.out.println(b2.author.name);
    }
}
