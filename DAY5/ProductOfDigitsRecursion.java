package DAY5;
import java.util.*;
public class ProductOfDigitsRecursion {
    static int productOfDigits(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return (n % 10) * productOfDigits(n / 10); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int result = productOfDigits(num);
        System.out.println("Product of digits in " + num + " is: " + result);
        sc.close();
    }
}