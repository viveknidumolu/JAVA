package DAY3;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original_num = num;
        sc.close();
        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        if(rev == original_num ){
            System.out.println(original_num + " is a Palindrome");
        }
        else{
            System.out.println(original_num + " is not a Palindrome");
        }
    }
}
