package com.rupali.Day49;
public class ModifyString {
    public static void main(String args[]){
        String str="Daman";
        char[] charArray = str.toCharArray();
        charArray[0] = 'N';
        System.out.println(str);
        System.out.println(charArray);
    }
}