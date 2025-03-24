package sorting;



public class Quicksort
{
    
 
        // Function to perform Quick Sort
        static void quickSort(int[] arr, int low, int high)
         {
            if (low < high) 
            {
                int pivotIndex = partition(arr, low, high);
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }
     
    
        static int partition(int[] arr, int low, int high)
         {
            int pivot = arr[high]; // Choosing the last element as pivot
            int i = low - 1; // Pointer for the smaller element
     
            for (int j = low; j < high; j++) 
            {
                if (arr[j] < pivot)
                 {
                    i++;
                    swap(arr, i, j);
                }
            }
     
            swap(arr, i + 1, high); // Swap pivot to its correct position
            return i + 1;
        }
     
        // Swap function
        static void swap(int[] arr, int i, int j)
         {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
     
        // Main method to test Quick Sort
        public static void main(String[] args)
         {
            int[] arr = {10, 7, 8, 9, 1, 5};
            int n = arr.length;
            
            System.out.println("Original Array:");
            printArray(arr);
     
            quickSort(arr, 0, n - 1);
     
            System.out.println("Sorted Array:");
            printArray(arr);
        }
     
        // Function to print the array
        static void printArray(int[] arr) 
        {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
