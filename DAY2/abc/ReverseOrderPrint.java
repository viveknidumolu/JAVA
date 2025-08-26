package DAY2;
import java.util.*;
public class ReverseOrderPrint {
    static void Reverse(int n){
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        int n = sc.nextInt();
        Reverse(n);
        sc.close();
    }
}
