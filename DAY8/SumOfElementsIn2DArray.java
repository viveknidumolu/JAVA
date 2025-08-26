package DAY8;
import java.util.*;
public class SumOfElementsIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        sc.close();
    }
}