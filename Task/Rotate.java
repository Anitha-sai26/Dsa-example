package Task;

import java.util.Arrays;
 
public class Rotate {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle cases where k > n
 
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
 
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
 
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
 
    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
 
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));  // Output: [5, 6, 1, 2, 3, 4]
    }
}




   