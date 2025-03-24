package Hashtable;

import java.util.*;
 
public class Hashmapstream {
    public static void main(String[] args) {
        // Creating a HashMap (Hash Table)
        HashMap<Integer, String> hashTable = new HashMap<>();
 
        // Adding elements
        hashTable.put(1, "Apple");
        hashTable.put(2, "Banana");
        hashTable.put(3, "Cherry");
        hashTable.put(4, "Mango");
        hashTable.put(5, "Grapes");
        //hashTable.put("ani");
       // System.out.println(hashTable);

 
        //1. Display all key-value pairs using Streams
        System.out.println("Hash Table Elements:");
        hashTable.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
      
       //2. Filtering elements (e.g., get entries where value contains 'a')
      System.out.println("\nFiltered Elements (values containing 'a'):");
      hashTable.entrySet().stream()
              .filter(entry -> entry.getValue().toUpperCase().contains("M"))
              .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));


      
        
    }
}
