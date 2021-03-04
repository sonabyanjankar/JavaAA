package Sona_Assignment2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.print("Which number do you want the factorial for : ");
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int factorial=1;

        while (num!=1){

            factorial= factorial*num;
            num--;
        }
        System.out.println("Factorial of entered number  is " + factorial);

    }
}
