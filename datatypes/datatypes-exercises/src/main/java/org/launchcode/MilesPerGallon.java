package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used:");
        Double gallons = input.nextDouble();

        System.out.println("Miles per gallon: " + (miles / gallons));
    }
}
