package DAY2.ASSIGNMENT;
import java.util.*;
public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        sc.close();
        System.out.println("Multiples of " + num + " upto " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
    }
}
