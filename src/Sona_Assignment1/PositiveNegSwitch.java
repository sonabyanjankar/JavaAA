package Sona_Assignment1;

import java.util.Scanner;

public class PositiveNegSwitch {
    public static void main(String[] args) {

        System.out.print("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch(num){
        case -1 :
            System.out.println("negative");
            break;
        case 0 :
            System.out.println("zero");
            break;
        case 1: case 2:
        case 100:

               System.out.println("Positive");
                break;




        }
    }
}
