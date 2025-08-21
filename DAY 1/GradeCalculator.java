package DAY1;
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in the subject:");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input. Please enter marks between 0 and 100.");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B+");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C+");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D+");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: E+");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
        
        sc.close();
    }
}
