package StackandQueue;

import java.util.Stack;

public class ReverseStack {
    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        } else {
            int i = getAndRemoveLastElement(stack);
            reverse(stack);
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 1; i <= 3; i++) {
            s1.push(i);
        }
        System.out.println(s1);
        reverse(s1);
        System.out.println(s1);
    }
}
