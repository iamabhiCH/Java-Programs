

// WAP to take a number as input from user and print that number as outpur.

import java.util.Scanner;

// Creating class for taking input and printing output....
public class input_output {
    // Declaring main method.....
    public static void main(String[] str){
        // Creating object of scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        // Printing output..
        System.out.println("You entered "+x);
        System.out.println("Thank You.......");
    }
}
