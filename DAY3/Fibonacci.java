package DAY3;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.print("Enter number of terms in the series: ");
        int num = sc.nextInt();
        
        for(int i=1; i <= num; i++){
            System.out.print(a +" ");
            int c = a+b;
            a = b;
            b = c;
            sc.close();
        }
    }
}
