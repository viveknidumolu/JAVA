package DAY7;
import java.util.*;
public class FrequencyOfAllElementsInArray {
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
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(visited[i]) {
                continue;
            }
            int count = 1;
            for(int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occured " + count + " times");
        }
    }
}
