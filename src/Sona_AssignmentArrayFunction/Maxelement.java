package Sona_AssignmentArrayFunction;

public class Maxelement {

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,89,45,79,67,0,60, 100};
        int temp=0;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
                if(arr[j]>arr[i]){
                   temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
        }
        System.out.println("Maximum element in the array is " + temp+".");


    }
}
