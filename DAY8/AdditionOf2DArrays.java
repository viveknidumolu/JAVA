package DAY8;
import java.util.*;
public class AdditionOf2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the columns: ");
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] sum = new int[n][m];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of the two arrays is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
