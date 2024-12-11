package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");

        double radius = input.nextDouble();

        //double areaOfCircle = 3.14 * radius * radius;
        double areaOfCircle = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
    }
}
