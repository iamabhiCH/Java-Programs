

// WAP to swap two numbers.....

import java.util.Scanner;

// Creating class for swap two numbers..
public class swap_Numbers {
    // Declaring main method...
    public static void main(String[] str){

        // Creating object of scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user..
        System.out.print("Enter your first number : ");
        int x = sc.nextInt();
        System.out.print("Enter your second number : ");
        int y = sc.nextInt();

        // Logic for swapping..
        int z = x;
        x = y;
        y = z;

        // Printing output....
        System.out.println("First number : "+x);
        System.out.println("Second number : "+y);
        System.out.println("Thank you...");
    }
}
