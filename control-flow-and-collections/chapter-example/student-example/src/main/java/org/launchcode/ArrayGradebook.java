package org.launchcode;

import java.util.Scanner;

public class ArrayGradebook {
    public static void main(String[] args) {
        // Allow for at most 30 students
        int maxStudents = 30; //to be passed as array size for students and size

        String[] students = new String[maxStudents]; //creating array with datatype String Class
        double[] grades = new double[maxStudents]; //creating array with primitive data type double
        Scanner input = new Scanner(System.in);

        String newStudent;
        int numStudents = 0; //accumulator to be passed into our do while

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students[numStudents] = newStudent; //adds newStudent to students at index of numStudents index
                numStudents++;
            }

        } while(!newStudent.equals("")); //breaks do-while if an empty string is entered.

        for (String student : students){
            System.out.println(student);
        }

        // Get student grades
        for (int i = 0; i < numStudents; i++) { //normal for loop, we can use a for each to iterate over the array instead, as seen on line 30-31
            System.out.print("Grade for " + students[i] + ": ");
            double grade = input.nextDouble();
            grades[i] = grade;
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i] + " (" + grades[i] + ")");
            sum += grades[i];
        }

        double avg = sum / numStudents;
        System.out.println("Average grade: " + avg);
    }
}
