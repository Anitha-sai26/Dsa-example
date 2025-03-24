package Stack;

// Node class
class Node {
    int data;
    Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
// Stack class
class Stackex{
    Node top;
 
    public Stackex() {
this.top = null;
    }
 
    // Push (Insert an element at the top)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
 
    // Pop (Remove and return the top element)
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
 
    // Peek (View the top element without removing it)
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
 
    // Display the stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        Stackex stack = new Stackex();
 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: 30 -> 20 -> 10 -> null
 
        System.out.println("Top element: " + stack.peek()); // Output: 30
 
        System.out.println("Popped: " + stack.pop()); // Output: 30
        stack.display(); // Output: 20 -> 10 -> null
    }
}
