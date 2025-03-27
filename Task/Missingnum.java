package Task;


import java.util.Arrays;
 
public class Missingnum {
    public static int findMissingNumber(int[] arr, int n) {
        Arrays.sort(arr); // Step 1: Sort the array
        
        for (int i = 0; i < n - 1; i++) { // Step 2: Traverse the array
            if (arr[i] != i + 1) {
                return i + 1; // Return the missing number
            }
        }
        return n; // If no number is missing in between, return n
    }
 
    public static void main(String[] args)
     {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};

        int n = 8;

        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}