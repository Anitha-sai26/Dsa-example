package Task;



import java.util.Arrays;
 
public class Duplicates {
    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr);
        
        System.out.print("Duplicate numbers: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6};
        findDuplicates(arr);
    }
}