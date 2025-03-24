package Hashtable;

// Node class to store key-value pairs
class HashNode<K, V> {
    K key;
    V value;
    HashNode<K, V> next;
 
    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
 
// Custom Hash Table class
class CustomHashTable<K, V> {
    private int capacity; // Size of the hash table
    private HashNode<K, V>[] table;
 
    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashTable(int size) {
        this.capacity = size;
        this.table = new HashNode[capacity];
    }
 
    // Hash function
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }
 
    // Insert key-value pair
    public void put(K key, V value) {
        int index = hash(key);
        HashNode<K, V> newNode = new HashNode<>(key, value);
 
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            HashNode<K, V> current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) { // Update existing key
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = newNode; // Insert at end (chaining)
        }
    }
 
    // Get value by key
    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> current = table[index];
 
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Key not found
    }
 
    // Remove a key
    public void remove(K key) {
        int index = hash(key);
        HashNode<K, V> current = table[index];
        HashNode<K, V> prev = null;
 
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next; // Remove first node
                } else {
                    prev.next = current.next; // Remove from middle or end
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
 
    // Display the hash table
    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            HashNode<K, V> current = table[i];
            while (current != null) {
                System.out.print("[" + current.key + " -> " + current.value + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}
 
// Main class to test the custom hash table
public class Hashtable {
    public static void main(String[] args) {
        CustomHashTable<Integer, String> hashTable = new CustomHashTable<>(5);
 
        // Insert elements
        hashTable.put(1, "Apple");
        hashTable.put(2, "Banana");
        hashTable.put(3, "Cherry");
        hashTable.put(8, "Mango"); // Will collide with key 3 (if capacity is 5)
 
        // Display table
        System.out.println("Hash Table:");
        hashTable.display();
 
        // Get value
        System.out.println("Value for key 2: " + hashTable.get(2));
 
        // Remove a key
        hashTable.remove(1);
        System.out.println("After removing key 1:");
        hashTable.display();
    }
}