package com.rupali.Day43;
import java.util.Arrays;
public class Diagonal_matrix {
    public static void main(String args[]) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    product *= matrix[i][j];
                }
            }
        }
        System.out.println(product);
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length; l++) {
                if (k == l) {
                    matrix[k][l] = product;
                }
            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}