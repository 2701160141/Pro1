package nowcoder;

import java.util.Scanner;

public class nk0701E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int kong = 2 * n;
            String[] string = new String[n];
            String[] xingxing = new String[n];
            String str = "";
            String xing = "";
            String zhong = "";
            for (int i = 0; i <= n; i++) {
                zhong = zhong + "*";
            }
            for (int i = 0; i <= n * 2; i++) {
                if (i < n) {
                    for (int j = 0; j < kong; j++) {
                        str = str + " ";
                    }
                    kong = kong - 2;
                    string[i] = str;
                    str = "";
                    for (int k = 0; k <= i; k++) {
                        xing = xing + "*";
                    }
                    xingxing[i] = xing;
                    xing = "";
                    System.out.println(string[i] + xingxing[i]);
                } else if (i == n) {
                    System.out.println(zhong);
                } else {
                    System.out.println(string[2 * n - i] + xingxing[2 * n - i]);
                }
            }
        }
        cin.close();
    }
}
