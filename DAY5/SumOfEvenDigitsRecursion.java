package DAY5;
import java.util.*;
public class SumOfEvenDigitsRecursion {
    static int sumOfEvenDigits(int n) {
        if (n == 0) {
            return 0; 
        } else {
            int digit = n % 10; 
            if (digit % 2 == 0) { 
                return digit + sumOfEvenDigits(n / 10); 
            } else {
                return sumOfEvenDigits(n / 10); 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int result = sumOfEvenDigits(num);
        System.out.println("Sum of even digits in " + num + " is: " + result);
        sc.close();
    }
}
