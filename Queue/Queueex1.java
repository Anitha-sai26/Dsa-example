package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
 
public class Queueex1 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
 
        pq.add(30);
        pq.add(10);
        pq.add(20);
 
        System.out.println("Priority Queue: " + pq); 
        System.out.println("Dequeued: " + pq.poll()); // Output: 10 (smallest element)
        System.out.println("Updated Queue: " + pq); // Output: [20, 30]

        pq.add(5);
        System.out.println("Priority Queue: " + pq);


    }
}
