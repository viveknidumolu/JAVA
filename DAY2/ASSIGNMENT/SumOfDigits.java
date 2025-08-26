package DAY2.ASSIGNMENT;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        while(num > 0) {
            sum += num % 10; 
            num /= 10; 
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
