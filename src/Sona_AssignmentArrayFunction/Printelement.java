package Sona_AssignmentArrayFunction;

import java.util.Arrays;
import java.util.Scanner;

public class Printelement {
    public static void main(String[] args) {

        int [] arr= new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int j= 0;j<5; j++){
            System.out.println("Enter the element no. "+(j+1) +" of the array:");
            arr[j]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
