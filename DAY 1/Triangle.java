package DAY1;

import java.util.*;
public class Triangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the lengths of the three sides of the triangle:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if (a==b && a==c)
        System.out.println("Equilateral Triangle");
    else if(a==b || b==c || a==c)
        System.out.println("Isosceles Triangle");
    else 
        System.out.println("Scalene Triangle");
    
    sc.close();  
    }
}