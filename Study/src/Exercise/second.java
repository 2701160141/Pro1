package Exercise;

public class second {
    public static void main(String[] args) {
        int i, j, m, n, x;
        for (i = 1; i < 168 / 2 + 1; i++) {
            if (168 % i == 0) {
                j = 168 / i;
                if (i > j && (i + j) % 2 == 0 && (i - j) % 2 == 0) {
                    m = (i + j) / 2;
                    n = (i - j) / 2;
                    x = n * n - 100;
                    System.out.println(x);
                }
            }
        }
    }
}
