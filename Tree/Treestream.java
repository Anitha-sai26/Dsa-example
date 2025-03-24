package Tree;

import java.util.*;
 
public class Treestream {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(80);

 
        // Check if 30 exists in the TreeSet
        boolean exists = treeSet
                       .stream()
                       .anyMatch(n->n==20);
                      
                       //.contains(20);
                      
 
        System.out.println("Does 30 exist? " + exists);
        // Output: true
    }
}
