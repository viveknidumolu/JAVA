package DAY5;
import java.util.*;
public class FactorialRecursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
        sc.close();
    }
}