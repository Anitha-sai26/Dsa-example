package Queue;
    
    class Node {
        int data;
        Node next;
     
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     
    // Queue class
    class Queueex {
        Node front, rear;
     
        public Queueex() {
            this.front = this.rear = null;
        }
     
        // Enqueue (Add element to the queue)
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
     
        // Dequeue (Remove element from the queue)
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int value = front.data;
            front = front.next;
     
            if (front == null) {
                rear = null;
            }
     
            return value;
        }
     
        // Display the queue
        public void display() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
     
        public static void main(String[] args) {
            Queueex queue = new Queueex();
            
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            queue.display(); // Output: 10 -> 20 -> 30 -> null
     
            System.out.println("Dequeued: " + queue.dequeue()); // Output: Dequeued: 10
            queue.display(); // Output: 20 -> 30 -> null
            queue.enqueue(5);
            queue.display();
            
        }
    }

