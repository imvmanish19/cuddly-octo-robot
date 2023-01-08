/* 1) Write a program to keep asking for a number until you enter a negative number. At the end, print the sum of all entered numbers. */
import java.util.*;

public class AvoidNegativeNumberV2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter a number:");
            number = sc.nextInt();
        } while(number >= 0);
        System.out.println("Negative Number Entered! Bye!");
    }
}