package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used? ");
        double gallons = input.nextDouble();

        double mpg = miles / gallons;
        System.out.println("You are running on " + mpg + "mpg.");
    }
}