package nowcoder;

import java.util.Scanner;

public class Demo1 {
    static int father[];
//    static int total;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            init(n);
            for (int i = 0; i < m; i++) {
                union(cin.nextInt(), cin.nextInt());
            }
            if (father[n] == 1) System.out.println("Yes");
            else System.out.println("No");
        }
        cin.close();
    }

    private static void union(int x, int y) {
        int p = find(x);
        int q = find(y);
        if (p == q) return;
        father[q] = p;
//        total--;
    }

    private static int find(int x) {
        return x == father[x] ? x : (father[x] = find(father[x]));
    }

    private static void init(int n) {
//        total = n;
        father = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            father[i] = i;
        }
    }
}
