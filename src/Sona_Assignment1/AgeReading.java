package Sona_Assignment1;

import java.util.Scanner;

public class AgeReading {

    public static void main(String[] args) {
        System.out.print("Enter your age in number: ");
        Scanner scanner = new Scanner(System.in);
        byte age= scanner.nextByte();

        if(age<12){
            System.out.println("Child");
        }
        else if(age>=12 && age <20 ){
            System.out.println("Teen");
        }

        else if(age>=20 && age <30 ){
            System.out.println("Adult");
        }
        else if(age>=30 && age<55){
            System.out.println("Young");

        }
        else{
            System.out.println("Old");
        }

    }
}
