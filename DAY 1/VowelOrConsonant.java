package DAY1;
import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        if(!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z')) {
            System.out.println("Invalid input. Please enter an alphabetic character.");
            sc.close();
            return;
        }
        if(ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch+32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        }
        else {
            System.out.println(ch + " is a consonant.");
        }
        sc.close();
    }
}