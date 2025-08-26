package DAY2;
import java.util.*;
public class OneToHundred {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
