package nowcoder;

import java.util.Scanner;

public class nk0701A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long a = cin.nextLong();
        long b = cin.nextLong();
        long sum = (a + b) % 100;
        System.out.println(sum);
    }
}
