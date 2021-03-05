package Sona_AssignmentArrayFunction;

import java.util.Scanner;

public class OddevenFunction {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();

        isOddEven(num) ;

    }

    static int isOddEven(int num){
        int even = num%2;

        if (even == 0) {
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }

        return num;

    }
}
