package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(); //type String Class, passing type to new ArrayList is not required as it is implicit in the declaration.
        ArrayList<Double> grades = new ArrayList<>(); //type Double Class
        Scanner input = new Scanner(System.in);
        String newStudent; //declaring variable to use in our do-while loop

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));

        // Get student grades
        for (String student : students) { //for each loop used to iterate over each student in students ArrayList
            System.out.print("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}