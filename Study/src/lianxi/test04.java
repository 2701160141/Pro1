package lianxi;

import java.util.ArrayList;
import java.util.Scanner;

public class test04 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = cin.nextInt();
            }
        }
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
//        System.out.println(printMatrix(matrix));
        System.out.println(printMatrix(A));
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix[0].length == 0 || matrix.length == 0) {
            return result;
        }

        int r = 0;
        int row = matrix.length - 1;
        int c = 0;
        int col = matrix[0].length - 1;

        while (r <= row && c <= col) {
            for (int i = r; i <= row; i++)
                result.add(matrix[i][c]);
            for (int i = c + 1; i <= col; i++)
                result.add(matrix[row][i]);
            if (c != col)
                for (int i = row - 1; i >= r; i--)
                    result.add(matrix[i][col]);
            if (r != row)
                for (int i = col - 1; i > c; i--)
                    result.add(matrix[c][i]);
            r++;
            row--;
            c++;
            col--;
        }
        return result;
    }
}