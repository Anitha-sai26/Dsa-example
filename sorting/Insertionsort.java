package sorting;

public class Insertionsort 
{
 
    public static void insertionSort(int[] arr)
     {
        int n = arr.length;
        for (int i = 1; i < n; i++)
         {
            int key = arr[i];
            int j = i - 1;
 
            // Move elements of arr[0..i-1] that are greater than key
            // one position ahead of their current position
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    
    
     }

 
    public static void main(String[] args)
     {
        int[] arr = {64, 34, -25, 12, 0,0,22, 11, 90};
        

     
            System.out.println("Original Array:");
            for (int num : arr)
             {
                System.out.print(num + " ");
            }
     
            insertionSort(arr);
            
     
            System.out.println("\nSorted Array:");
            for (int num : arr)
             {
                System.out.print(num + " ");
        
             }
             
    }
}



