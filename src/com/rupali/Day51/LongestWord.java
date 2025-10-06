package com.rupali.Day51;
import java.util.StringTokenizer;
public class LongestWord {
    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog";
        StringTokenizer words = new StringTokenizer(str, " .,?");
        String longest = "";
        while (words.hasMoreTokens()) {
            String word = words.nextToken();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }
}
