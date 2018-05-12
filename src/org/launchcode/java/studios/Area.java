package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static Double CircleArea(Float radius)
    {
        double area;

        area = 3.14 * (radius * radius);

        return area;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Float radius;
        Double area;

        do {
            System.out.println("Please enter the radius of the circle:");
            radius = in.nextFloat();
            //System.out.println("\n radius: "+ radius + "\n");

            if (radius < 0.0) {
                System.out.println("The radius can't be negative\n");
            } else {
                area = CircleArea(radius);
                System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
            }
        }while (radius < 0.0);
    }
}
