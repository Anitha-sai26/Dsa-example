package sorting;

public class Insertionsortdouble

{
    public static void insertionSort(double[] arr)
     {
        int n = arr.length;
        for (int i = 1; i < n; i++) 
        {
            double key = arr[i];  // Pick the current element
            int j = i - 1;
 
            // Move elements that are greater than key one position ahead
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert key at its correct position
        }
    }
 
    public static void main(String[] args) {
        double[] arr = {5.2,-3.1,0, 8.6, 1.9, 2.4};
   System.out.println("unsorted array:");
            for (double num : arr)
             {
                System.out.print(num + " ");
            }
     
            insertionSort(arr);
            
     
            System.out.println("\nSorted Array:");
            for (double num : arr)
             {
                System.out.print(num + " ");
        
             }

    }
}


