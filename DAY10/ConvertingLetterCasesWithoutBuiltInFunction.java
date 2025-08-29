package DAY10;
import java.util.*;
public class ConvertingLetterCasesWithoutBuiltInFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a = sc.nextLine();
        String res1 = "";
        String res2 = "";
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(ch >= 97 && ch <= 122){
                res1 = res1 + ((char)(ch - 32));
            }
            else{
                res1 = res1 + ch;
            }
        }
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(ch >= 65 && ch <= 90){
                res2 = res2 + ((char) (ch + 32));
            }
            else{
                res2 = res2 + ch;
            }
        }
        System.out.println("Original String : " + a);
        System.out.println("String in uppercase : " + res1);
        System.out.println("String in lowercase : " + res2);
        sc.close();
    } 
}