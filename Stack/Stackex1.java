package Stack;

import java.util.Stack;

public class Stackex1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
 
        // Push elements into the stack
        stack.push(40);
        stack.push(20);
        stack.push(30);
 
        // Display stack
        System.out.println("Stack: " + stack); // Output: [10, 20, 30]
 
        // Peek top element
        System.out.println("Top element: " + stack.peek()); // Output: 30
 
        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // Output: 30
 
        // Display updated stack
        System.out.println("Updated Stack: " + stack); // Output: [10, 20]
    }
}
