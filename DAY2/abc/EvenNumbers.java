package DAY2;
import java.util.*;
public class EvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int num = sc.nextInt();
        for(int i = 0; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
