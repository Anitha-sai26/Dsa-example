package Searching;

public class Linearsearch 
{

    static int linearSearch(int[] arr, int key)
     {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == key) 
            {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
 
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 35;
 
        int result = linearSearch(arr, key);
 
        if (result != -1) 
        {
            System.out.println("Element found at index: " + result);
        } else
        {
            System.out.println("Element not found in the array.");
        }
    }
}

