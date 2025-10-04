package com.rupali.Day51;

public class Palindrome {

        public static boolean isPalindrome(String sentence) {
            String loww = sentence.toLowerCase().replaceAll("[^a-z]", "");
            String rev = new StringBuilder(loww).reverse().toString();
            return loww.equals(rev);
        }
        public static void main(String[] args) {
            String sen1 = "madam";
            String sen2 = "Hello World";
            System.out.println(isPalindrome(sen1));
            System.out.println(isPalindrome(sen2));
        }
    }