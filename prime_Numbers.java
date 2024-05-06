

// WAP to find or display all the prime numbers between 1 and N.....

import java.util.Scanner;

public class prime_Numbers {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of N : ");
        int n = sc.nextInt();

        boolean flg = true;
        System.out.println("Here is your all prime numbers between 1 & "+n);
        for(int i = 1; i <= n; i++){
            if(i == 0 || i == 1){
                continue;
            }

            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    flg = false;
                    break;
                }
            }

            if(flg){
                System.out.print(i+" ");
            }
            flg = true;
        }
    }
}
