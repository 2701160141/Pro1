package leetcode;

import java.util.Arrays;

public class LCfirst {

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        QuickSort(A, 0, A.length - 1);
//        for (int i = 0; i < A.length; i++) {
//            System.out.print(A[i] + " ");
//        }
        Arrays.asList(A).forEach(item -> System.out.print(item + " "));
    }

    private static int partition(int[] R, int s, int t) {
        int tmp = R[s];
        while (s < t) {
            while (s < t && R[t] >= tmp) t--;
            R[s] = R[t];
            while (s < t && R[s] <= tmp) s++;
            R[t] = R[s];
        }
        R[s] = tmp;
        return s;
    }

    private static void QuickSort(int[] R, int s, int t) {
        int i;
        if (s < t) {
            i = partition(R, s, t);
            QuickSort(R, s, i - 1);
            QuickSort(R, i + 1, t);
        }
    }
}
