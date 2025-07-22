package list;

import java.util.Stack;

public class StackConcept {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack);
    }
}
