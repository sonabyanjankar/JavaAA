package Sona_AssignmentArrayFunction;

import java.util.Arrays;

import java.util.Scanner;

public class SumofArrayElements {
          public static void main(String[] args) {

            int [] arr=new int[10];
            Scanner scanner = new Scanner(System.in);
            int sum=0;

            for (int j= 0;j<10; j++){
                System.out.print("Enter the element no. "+(j+1) +" of the array:");
                arr[j]= scanner.nextInt();
                sum= sum+arr[j];
            }
            System.out.println(Arrays.toString(arr));
              System.out.println("Sum of the elements in the array is " + sum+ ".");
        }
    }

