package nowcoder;

import java.util.Scanner;

public class nk0701I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double[] a = new double[5];
        double[] b = new double[5];
        double[] c = new double[5];
        double[] d = new double[5];
        double[] e = new double[5];
        double suma = 0, sumb = 0, sumc = 0, sumd = 0, sume = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = cin.nextDouble();
            suma += a[i];
        }
        for (int i = 0; i < 5; i++) {
            b[i] = cin.nextDouble();
            sumb += b[i];
        }
        for (int i = 0; i < 5; i++) {
            c[i] = cin.nextDouble();
            sumc += c[i];
        }
        for (int i = 0; i < 5; i++) {
            d[i] = cin.nextDouble();
            sumd += d[i];
        }
        for (int i = 0; i < 5; i++) {
            e[i] = cin.nextDouble();
            sume += e[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(suma);
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(sumb);
        for (int i = 0; i < 5; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println(sumc);
        for (int i = 0; i < 5; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println(sumd);
        for (int i = 0; i < 5; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println(sume);
    }
}
