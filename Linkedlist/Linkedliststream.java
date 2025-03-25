package Linkedlist;
import java.util.LinkedList;

import java.util.*;
 
public class Linkedliststream {
    public static void main(String[] args) {
    
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
 
        //1. Add elements
        list.addFirst(5);  // Adds at the beginning
        list.addLast(60);  // Adds at the end
 
        //2. Remove elements
        list.removeFirst(); // Removes the first element (5)
        list.removeLast();  // Removes the last element (60)
 
        //3 filtering & printing
        System.out.println("\nList elements:");
        list.forEach(n -> System.out.println(n + " "));
        System.out.println("Filtered List (values > 20):");
        list.stream()
        .filter(n -> n > 20)
        .forEach(n->System.out.print(n+" "));
 
        
    }
}
