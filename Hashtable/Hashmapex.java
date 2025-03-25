package Hashtable;


import java.util.*;
 
public class Hashmapex {
    public static boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length()) return false; // Quick length check
 
        // Create HashMap to count characters in s
        Map<Character, Integer> countMap = new HashMap<>();

        
        for (char c : s.toCharArray())
         {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
 
        // Subtract character counts using t
        for (char c : t.toCharArray())
         {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) 
            {
                return false; // Character missing or overused
            }
            countMap.put(c, countMap.get(c) - 1);
        }
 
        return true; // If all counts reach zero, it's an anagram
    }
 
    public static void main(String[] args)
     {
        System.out.println(isAnagram("listen", "silent")); // Output: true
        System.out.println(isAnagram("hello", "world"));   // Output: false
        System.out.println(isAnagram("hello world", "world hello"));
    }
}























    
    
    

    

