package Functionalinterfaceex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicateex {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        
        // Predicate to check even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .collect(Collectors.toList());
 
        System.out.println("Even numbers: " + evenNumbers);
        
        Predicate<Integer> isGreaterThan20 = num -> num > 20;
 
        Predicate<Integer> evenAndGreaterThan20 = isEven.and(isGreaterThan20);
        
        System.out.println(evenAndGreaterThan20.test(22)); // true
        System.out.println(evenAndGreaterThan20.test(18)); // false
    }
}
    

