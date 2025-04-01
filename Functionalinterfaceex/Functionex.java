package Functionalinterfaceex;
import java.util.function.Function;
 
class Employee {
    String name;
    double salary;
 
    Employee(String name, double salary) {
this.name = name;
        this.salary = salary;
    }
}
 
public class Functionex {
    public static void main(String[] args) {
        Employee emp = new Employee("Ani", 15000);
 
        // Function to calculate salary after a 10% bonus
        Function<Employee, Double> salaryAfterBonus = e -> e.salary * 1.1;
 
        System.out.println("Salary after bonus: " + salaryAfterBonus.apply(emp)); // Output: 5500.0
    }
}


    

