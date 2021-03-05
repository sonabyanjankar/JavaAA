package Sona_AssignmentArrayFunction;

import java.util.Arrays;
public class Namelist {

    public static void main(String[] args) {

        String[] names = {"Ram", "Sita", "Ravan", "Hanuman", "Krishna"};
        int size = names.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));// printing the sorted array in alphabetical order

        int count = 0;

        for (int k = 0; k < size; k++) {
            if (names[k].equals( "Jesus")) {
                System.out.println("Jesus is  present in the array");

            } else {
                count++;
            }
        }
        if (count == size) {
            System.out.println("Jesus is not present in the array. ");
        }


        for (int l = 0; l < size; l++) {

            if (names[l].equals("Ravan") ){ //Replacing Ravan with Jesus
                names[l] = "Jesus";

            }

        }
        System.out.println(Arrays.toString(names));

    }
}


