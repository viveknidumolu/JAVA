package DAY8;
import java.util.*;
public class SecondSmallestElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the no.of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] < smallest){
                    secondSmallest = smallest;
                    smallest = arr[i][j];
                } else if(arr[i][j] < secondSmallest && arr[i][j] != smallest){
                    secondSmallest = arr[i][j];
                }
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        }
        sc.close();
    }
}
