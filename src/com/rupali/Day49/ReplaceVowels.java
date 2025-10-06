package com.rupali.Day49;

public class ReplaceVowels {
    public static void main(String args[]){
        String place="India";
        char[] chr=place.toCharArray();
        System.out.println(chr);
        for(int i=0;i<chr.length;i++){
            char v=chr[i];
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
                chr[i]='*';
            }
        }
        System.out.println(chr);
    }
}
