package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rectangles length:");
        Integer length = input.nextInt();

        System.out.println("Enter the rectangles width:");
        Integer width = input.nextInt();

        System.out.println("Rectangle Area: " + (width * length));
    }
}
