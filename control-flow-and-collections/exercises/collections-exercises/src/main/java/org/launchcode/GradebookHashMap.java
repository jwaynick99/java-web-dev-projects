package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();

        Scanner input = new Scanner(System.in);
        Integer studentID = 0;
        String studentName;
        do {
            System.out.println("ID: " + studentID + " Student Name:");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                students.put(studentID, studentName);
                studentID++;
            }
        } while (!studentName.equals(""));
        System.out.println(students);
        input.close();

        System.out.println("\nClass Roster");
        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("\nClass Size: " + students.size());
    }
}
