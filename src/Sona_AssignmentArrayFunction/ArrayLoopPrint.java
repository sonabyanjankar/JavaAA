package Sona_AssignmentArrayFunction;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopPrint {

    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        int [] arr = new int[i];
        System.out.println("Enter the element of the array:");
        for (int j= 0;j<i; j++){

            arr[j]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

          }
}
