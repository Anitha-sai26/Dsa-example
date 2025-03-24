package Queue;
import java.util.*;
import java.util.stream.Collectors;
 
public class Queuestream {
    public static void main(String[] args) {
    
      Queue<Integer> pq = new ArrayDeque<>();
 
        pq.add(30);
        pq.add(10);
        pq.add(20);
 
 
        // Sort the queue using streams
        Queue<Integer> sortedQueue = pq.stream()
                                          .sorted()
                                          .collect(Collectors.toCollection(ArrayDeque::new));
 
        System.out.println("Sorted Queue: " + sortedQueue);
        // Output: [10, 20, 30, 40, 50]
    }
}

