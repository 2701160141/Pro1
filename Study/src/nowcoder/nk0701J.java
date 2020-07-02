package nowcoder;

import java.util.Scanner;

public class nk0701J {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] A = new int[n][n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = cin.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && A[i][j] >= 0) continue;
                if (i > j && A[i][j] != 0) flag = false;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
