package DAY3;
import java.util.*;
public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        for(int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                sum += i;
            }
        }
        System.out.println("The sum of prime numbers up to " + num + " is: " + sum);
    }
}
