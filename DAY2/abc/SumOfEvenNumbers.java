package DAY2;
import java.util.*;
public class SumOfEvenNumbers {
    public static void main(String[] args){
        int sum = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int num = sc.nextInt();
        for( int i = 0; i <= num; i+=2){
            sum += i;
        }
        System.out.println("Sum of even numbers upto "+num+ " is: "+ sum);
        sc.close();
    }
}
