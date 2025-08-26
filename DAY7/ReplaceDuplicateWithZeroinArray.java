package DAY7;
import java.util.*;
public class ReplaceDuplicateWithZeroinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = 0; 
                }
            }
        }
        System.out.println("Array after replacing duplicates with 0: ");
        for(int i = 0; i < n; i++) {    
            System.out.print(arr[i] + " ");
        }
    }
}
