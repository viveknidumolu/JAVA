package DAY5;
import java.util.*;
public class FibonacciRecursion {
    static int fib(int n) {
        if (n <= 1) {
            return n; 
        }
        return fib(n - 1) + fib(n - 2); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int result = fib(num);
        System.out.println("Fibonacci of " + num + " is: " + result);
        for (int i = 0; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}