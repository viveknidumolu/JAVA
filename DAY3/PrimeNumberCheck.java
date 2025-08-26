package DAY3;
import java.util.*;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if(num == 2){
            System.out.println(num + " is a prime number.");
            return;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }     
}
