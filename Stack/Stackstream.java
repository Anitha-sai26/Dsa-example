package Stack;


    import java.util.*;
import java.util.stream.Collectors;
 
public class Stackstream {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.push(50);
 
        // Sort the stack using streams
        Stack<Integer> sortedStack = stack.stream()
                                          .sorted()
                                          .collect(Collectors.toCollection(Stack::new));
 
        System.out.println("Sorted Stack : " + sortedStack);
        // Output: [10, 20, 30, 40, 50]
    }
}
    

