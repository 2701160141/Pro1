package nowcoder;

import java.util.Scanner;

public class nk0701C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int A = cin.nextInt();
            int B = cin.nextInt();
            int C = cin.nextInt();
            if (Istriangle(A, B, C)) {
                if (A == B && A == C) System.out.println("Equilateral triangle!");
                else if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
                    System.out.println("Isosceles triangle!");
                else System.out.println("Ordinary triangle!");
            } else System.out.println("Not a triangle!");
        }
        cin.close();
    }

    private static boolean Istriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a)
            return true;
        return false;
    }
}
