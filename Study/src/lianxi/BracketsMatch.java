package lianxi;

import java.util.Stack;

public class BracketsMatch {
    public static void main(String[] args) {
        System.out.println(BracketsMatch.partenMatch("([]{[]}[])"));
    }

    public static boolean partenMatch(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(str.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) return false;
                    if (!BracketsMatch.match(stack.pop(), str.charAt(i))) return false;
                    break;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

    private static boolean match(char strright, char strleft) {
        switch (strright) {
            case '(':
                if (strleft == ')') return true;
                break;
            case '[':
                if (strleft == ']') return true;
                break;
            case '{':
                if (strleft == '}') return true;
                break;
        }
        return false;
    }
}
