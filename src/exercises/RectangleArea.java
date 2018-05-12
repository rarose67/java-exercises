package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in;
        Float length;
        Float width;
        Float area;

        in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = in.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        width = in.nextFloat();

        area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
