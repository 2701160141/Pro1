package nowcoder;

import java.util.Scanner;

public class nk0701B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.next();
            if (Character.isUpperCase(s.charAt(0))) {
                s = s.toLowerCase();
            } else {
                s = s.toUpperCase();
            }
            System.out.println(s);
        }
        cin.close();
    }
}
