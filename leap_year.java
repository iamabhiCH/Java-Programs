// WAP to find that the given year is leap year or not..

import java.util.Scanner;

public class leap_year {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Year in numeric format : ");
        int y = sc.nextInt();

        if(y % 400 == 0){
            System.out.println(y+" is a leap year.");
        }
        else if (y % 100 == 0) {
            System.out.println(y + " is not a leap year.");
        }
        else if (y % 4 == 0) {
            System.out.println(y+" is a leap year.");
        }
        else{
            System.out.println(y+" is not a leap year.");
        }
    }
}
