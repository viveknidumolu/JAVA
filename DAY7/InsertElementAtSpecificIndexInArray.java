package DAY7;
import java.util.*;
public class InsertElementAtSpecificIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1]; 
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter the index to insert the element at (0 to " + n + "): ");
        int index = sc.nextInt();
        sc.close();
        if (index < 0 || index > n) {
            System.out.println("Invalid index. Please enter an index between 0 and " + n);
            return;
        }
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element; 
        System.out.println("Array after insertion: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}