/* 2) Write a program to ask for a name until the user enters END. Print the name each time. When you are done, print "I am done." */
import java.util.*;

public class NameLooper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("Enter a name:");
            name = sc.nextLine();
        } while(!name.equals("END"));
        System.out.println("I am done!");
    }
}