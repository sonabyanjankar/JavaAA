package Sona_Assignment1;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        System.out.print("Enter any number : ");
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();

        if(num>0){
            System.out.println("Positive");
        }
        else if (num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

    }
}
