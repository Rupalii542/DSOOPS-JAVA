package com.rupali.Day50;
import java.util.StringTokenizer;
public class stringQuestions{
    public static void main(String[] args){
        String data="Java,Python,C++";
        StringTokenizer st=new StringTokenizer(data,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
















