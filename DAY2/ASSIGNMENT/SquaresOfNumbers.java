package DAY2.ASSIGNMENT;
import java.util.*;

public class SquaresOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int num = sc.nextInt();  
        sc.close();
        System.out.println("Squares of numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {  
            System.out.println("Square of " + i + " is: " + (i * i));
        }
    }
}