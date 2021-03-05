package Sona_AssignmentArrayFunction;

public class Areafunction {

    public static void main(String[] args){

        double radius;

        calculate(100);

    }

    static void calculate(double radius )
    {
            System.out.printf("Diameter of the circle is %.2f", (radius*2));
           System.out.printf("\nArea of the circle is %.2f", (Math.PI*radius*radius) );
           System.out.printf("\nCircumference of circle is %.2f ", (2*Math.PI*radius));

    }
}

