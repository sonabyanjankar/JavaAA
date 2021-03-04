package Sona_Assignment1;

import java.util.Scanner;

public class ElectricityUnit {
    public static void main(String[] args) {

        System.out.print("Enter the energy consumed this month : ");
        Scanner scanner= new Scanner(System.in);
        int unit= scanner.nextInt();

        if(unit<200){
            System.out.println("Amount to be paid is "+ (unit*5) +".") ;
        }
        else if (unit>=200 && unit<=500){
            System.out.println("Amount to be paid is "+(unit*10) +".");
        }
        else{
            System.out.println("Amount to be paid is "+ (unit*20) +".");
        }
    }
}
