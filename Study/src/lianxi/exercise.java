package lianxi;

import java.util.HashMap;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        System.out.println(reversestr(s));
    }

    public static String reversestr(String s) {
        if (s.length() == 0 || s.length() == 1) return s;
        return s.charAt(s.length() - 1) + reversestr(s.substring(0, s.length() - 1));
    }
}
