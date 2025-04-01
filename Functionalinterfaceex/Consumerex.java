package Functionalinterfaceex;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
 
public class Consumerex {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ani", "chella", "laks");
 
        // Consumer to print each name
        Consumer<String> printName = name -> System.out.println(name);
 
        // Using Consumer with forEach
        names.forEach(printName);


    
        Consumer<String> greet = name -> System.out.print("Hello, " + name);
        Consumer<String> exclaim = name -> System.out.println("!");
         
        // Chaining consumers
        Consumer<String> greetAndExclaim = greet.andThen(exclaim);
        greetAndExclaim.accept("Ani"); // Output: Hello, Ani
        
   
   
   
   
   
   
    }
}
    

