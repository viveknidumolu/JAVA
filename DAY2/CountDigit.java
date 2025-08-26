package DAY2;
import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine(); 
        int count = num.length();
        sc.close();
        System.out.println("The number of digits in " + num + " is: " + count);     
    }
}