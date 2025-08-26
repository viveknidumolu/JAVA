package DAY3.ASSIGNMENT;
import java.util.*;
public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        int count = 0; 
        int num = 2;   
        int nthPrime = 0;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                nthPrime = num; 
            }
            num++;
        }
        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }
}