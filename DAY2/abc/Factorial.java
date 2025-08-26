package DAY2;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + num + " is: " + fact);
        sc.close();
    }
}