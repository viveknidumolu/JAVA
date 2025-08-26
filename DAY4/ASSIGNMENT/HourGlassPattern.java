package DAY4.ASSIGNMENT;
import java.util.*;
public class HourGlassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); 
            }
            for (int j = 0; j < (n - i) * 2 - 1; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); 
            }
            for (int j = 0; j < (n - i) * 2 - 1; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
        sc.close();
    }
}