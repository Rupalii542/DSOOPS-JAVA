package com.rupali.Day53;
class Movie {
    String title;
    double rating;
    Movie() {
        System.out.println("Movie namee");
    }
    Movie(String t, double r) {
        title = t;
        rating = r;
    }
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie("Robot", 9.0);
        System.out.println(m2.title +" , "+ m2.rating);
    }
}
