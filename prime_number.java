// WAP to find that the given number is prime or not.....

import java.util.Scanner;

public class prime_number {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number : ");
        int x = sc.nextInt();

        boolean flg = true;

        for(int i = 2; i <= x/2; i++){
            if(x % i == 0){
                flg = false;
                break;
            }
        }
        if(flg){
            System.out.println(x+" is a prime number.");
        }
        else{
            System.out.println(x+" is a non-prime number.");
        }
    }
}
