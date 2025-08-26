package DAY8;
import java.util.*;
public class LargestElementIn2DArray {
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
        int largest = arr[0][0];
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        sc.close();
    }
}