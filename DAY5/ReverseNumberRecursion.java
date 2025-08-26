package DAY5;

import java.util.Scanner;

public class ReverseNumberRecursion {
    public static void reverse(int num) {
        if (num < 10) {                                                           
            System.out.print(num);
        } else {
            System.out.print(num % 10);
            reverse(num / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.print("Reversed number is: ");
        reverse(num);
        sc.close();
    }
}