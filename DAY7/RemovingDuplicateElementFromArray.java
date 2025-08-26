package DAY7;
import java.util.*;
public class RemovingDuplicateElementFromArray {
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
        int temp[] = new int[n];
        int newsize = 0;
        for(int i = 0; i < n; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[newsize] = arr[i];
                newsize++;
            }
        }
        System.out.println("Array after removing duplicates: ");
        for(int i = 0; i < newsize; i++){
            System.out.print(temp[i] + " ");
        }
    }
}