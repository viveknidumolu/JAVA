package DAY4;
import java.util.*;
public class PyramidOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
