package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner in;
        Float miles;
        Float gas;
        Float miles_per_gallon;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        miles = in.nextFloat();
        System.out.println("How much gas(in gallons) have you used: ");
        gas = in.nextFloat();

        miles_per_gallon = miles / gas;

        System.out.println("The area of the rectangle is: " + miles_per_gallon);
    }
}
