package Task;

import java.util.Arrays;
 
public class Movingzero {
    public static void moveZeroesToEnd(int[] nums) {
        int j = 0;  // Pointer for non-zero elements
        
        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; // Move non-zero pointer
            }
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 0, 8, 7};
        
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));  // Output: [1, 9, 8, 7, 0, 0]
    }
}
