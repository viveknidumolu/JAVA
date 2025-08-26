package DAY6;
import java.util.*;
public class ReplaceEvenWithSquareOddWithCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] * arr[i];
            } else {
                arr[i] = arr[i] * arr[i] * arr[i];
            }
        }
        System.out.println("The modified array is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
