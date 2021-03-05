package Sona_AssignmentArrayFunction;

import java.util.Scanner;

public class MarksandGrades {
    public static void main(String[] args) {

        System.out.print("Enter your marks to find out your Grade: ");
        Scanner scanner = new Scanner(System.in);
        byte marks= scanner.nextByte();

        System.out.print("Your Grade for "+ marks +" marks is ");
        grade(marks);

    }
    static int grade(byte marks){

        if(marks>90 && marks<=100){
            System.out.println("AA");
        }
        else if (marks>80 && marks<=90){
            System.out.println("AB");
        }
        else if (marks>70 && marks<=80){
            System.out.println("BB");
        }
        else if (marks>60 && marks<=70){
            System.out.println("BC");
        }
        else if (marks>50 && marks<=60){
            System.out.println("CD");
        }
        else if (marks>40 && marks<=50){
            System.out.println("DD");
        }
        else{
            System.out.println("FAIL");
        }

       return 0;


    }
}
