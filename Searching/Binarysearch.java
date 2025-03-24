package Searching;

public class Binarysearch {
    
        // Binary search function
        static int binarySearch(int[] arr, int key) {
            int low = 0, high = arr.length - 1;
     
            while (low <= high) {
                int mid = low + (high - low) / 2; // Calculate mid index
     
                if (arr[mid] == key) {
                    return mid; // Return index if found
                } else if (arr[mid] < key) {
                    low = mid + 1; // Search in right half
                } else {
                    high = mid - 1; // Search in left half
                }
            }
            return -1; // Return -1 if not found
        }
     
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50,60,70,80}; // Sorted array
            int key =60 ;
     
            int result = binarySearch(arr, key);
     
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    
}

