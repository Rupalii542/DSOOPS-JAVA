package com.rupali.Day50;

public class AppendSentence {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Learning");
        sb.append(" Java");
        sb.insert(sb.length()," with fun");
        System.out.println(sb);
    }
}
