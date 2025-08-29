package DAY10;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();

        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if(str1.length() != str2.length()){
            System.out.println("Not anagram");
        }
        int str1Sum = 0;
        int str2Sum = 0;
        int product1 = 1;
        int product2 = 1;
        for(int i = 0; i < str1.length(); i++){
            str1Sum += str1.charAt(i);
            str2Sum += str2.charAt(i);
            product1 *= str1.charAt(i);
            product2 *= str2.charAt(i);
        }
        
        
        if(str1Sum == str2Sum && product1 == product2){
            System.out.println("Anagram");
        } 
        else {
            System.out.println("Not anagram");
        }
        sc.close();
    }    
}