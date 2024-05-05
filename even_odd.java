// WAP to check the given number is even or odd..

import java.util.Scanner;

public class even_odd {
    // Declaring main method...
    public static void main(String[] str) {

        // Creating object of scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user..
        System.out.print("Enter your number : ");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println(x+" is even number.");
            System.out.println("Thank you for using this application.");
        }
        else{
            System.out.println(x+" is odd number.");
            System.out.println("Thank you for using this application.");
        }
    }
}
