package com.rupali.Day43;

public class Array_2D {
    public static void main(String[] args) {
        int[][] mat = {{101, 85}, {102, 90}, {103, 78}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
