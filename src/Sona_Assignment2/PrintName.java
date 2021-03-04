package Sona_Assignment2;

public class PrintName
{

    public static void main(String[] args) {
        for (int n=1; n<=10; n++ ){

            System.out.println(n +". Niklaus");

        }
        System.out.println("\n");
        int j=1 ;
        do {
            System.out.println(j + " . Petrovsky");
            j++;
        }
        while (j<11);

        System.out.println("\n");

        int k= 0;
        while(k<10){
            System.out.println(k+1 + " The name is Niklaus Petrovsky");
            k++;
        }
    }
}
