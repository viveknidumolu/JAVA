package DAY8;
import java.util.*;
public class SumOfElementsInEachColumnIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no.of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=0;j<m;j++){
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += arr[i][j];
            }
            System.out.println("The sum of elements in column " + (j+1) + " is: " + sum);
        }
        sc.close();
    }
}
