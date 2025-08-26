package DAY7;
import java.util.*;
public class RightShiftTheArray {
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
        int lastElement = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        System.out.println("Array after right shift: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}