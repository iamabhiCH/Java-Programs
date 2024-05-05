// WAP to find the largest number among the given three numbers..

import java.util.Scanner;

public class largest_Number {
    // Declaring main method...
    public static void main(String[] str) {

        // Creating object of scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user..
        System.out.print("Enter Your First Number : ");
        int x = sc.nextInt();
        System.out.print("Enter Your Second Number : ");
        int y = sc.nextInt();
        System.out.print("Enter Your Third Number : ");
        int z = sc.nextInt();

        if(x > y){
            if(x > z){
                System.out.println(x +" is greater number.");
            }
            else{
                System.out.println(z+" is greater number.");
            }
        }
        else if (y > x) {
            if(y > z){
                System.out.println(y+" is greater number.");
            }
            else{
                System.out.println(z+" is greater number.");
            }
        }
    }
}
