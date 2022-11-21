package src.ch2;

import java.util.Stack;

public class C203_02_02_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        int x = stack.pop();
        System.out.println(x);
    }
}
