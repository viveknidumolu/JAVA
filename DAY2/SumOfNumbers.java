package DAY2;
import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args){
        int sum = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int num = sc.nextInt();
        for( int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("Sum of "+ num +" numbers is: "+ sum);
        sc.close();
    }
}
