/* Observe Repetation of the code */
/* 1) Write a program to keep asking for a number until you enter a negative number. At the end, print the sum of all entered numbers. */
/* You exactly don't know how many times the loop will repeat, at such cases, while/do-while loop is best choice*/
import java.util.*;

public class AvoidNegativeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        while(number >= 0) {
            System.out.println("Enter a number:");
            number = sc.nextInt();
        }
        System.out.println("Negative Number Entered! Bye!");
    }
}