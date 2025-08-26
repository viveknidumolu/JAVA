package DAY5;
import java.util.*;
public class SumOfDigitsRecursion {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; 
        } else {
            return n % 10 + sumOfDigits(n / 10); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int result = sumOfDigits(num);
        System.out.println("Sum of digits in " + num + " is: " + result);
        sc.close();
    }
}
