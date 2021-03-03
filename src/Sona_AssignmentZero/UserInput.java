package Sona_AssignmentZero;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        System.out.print("Please enter your name : ");
        Scanner scanner= new Scanner(System.in);
        String name= scanner.next();
        System.out.print("Enter your age : ");
        byte age= scanner.nextByte();
        System.out.print("Enter your address : ");
        String address= scanner.next();

        System.out.println("/n-----USER INFORMATION-----");
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}

