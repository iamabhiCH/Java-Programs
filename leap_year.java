// WAP to find that the given year is leap year or not..

import java.util.Scanner;

public class leap_year {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Year in numeric format : ");
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println(year+" is a leap year.");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
