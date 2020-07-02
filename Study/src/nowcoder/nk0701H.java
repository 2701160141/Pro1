package nowcoder;

import java.util.Scanner;

public class nk0701H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        boolean flag;
        String str = "sorted";
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = cin.nextInt();
        }
        if (A[N - 1] >= A[1]) flag = true;
        else flag = false;
        for (int i = 1; i < N; i++) {
            if (flag) {
                if (A[i] < A[i - 1]) str = "unsorted";
                break;
            } else {
                if (A[i] > A[i - 1]) str = "unsorted";
                break;
            }
        }
        System.out.println(str);
    }
}
