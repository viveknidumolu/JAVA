package DAY2;
import java.util.*;
public class NumberMultipplication {
    static void Multiplication(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n+" x "+ i+" = "+ n*i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        Multiplication(n);
        sc.close();
    }

}

