package com.rupali.Day51;

import java.util.StringTokenizer;

public class PrintNewLine {
    public static void main(String[] args){
        String fruits="apple, banana, grapes";
        StringTokenizer st=new StringTokenizer(fruits,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken().trim());
        }
    }
}
