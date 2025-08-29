package DAY10;
import java.util.*;
public class NumberOfWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a = sc.nextLine();
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i); 
            if (ch != ' ' && !inWord) { 
                count++;
                inWord = true;
            } else if (ch == ' ') { 
                inWord = false;
            }
        }

        System.out.println("Number of words in the given string is: " + count);
        sc.close();
    }
}