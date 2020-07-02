package nowcoder;

import java.util.Scanner;

public class nk0701G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = cin.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
    }
}
