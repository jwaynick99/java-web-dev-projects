package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()){
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));
        }
    }

    public static void Divide(int x, int y)
    {
        if (y <= 0){
            try {
                throw new ArithmeticException("Cannot divide by zero");
            } catch (ArithmeticException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName.contains(".java") && fileName.length() > 0){
            return 1;
        } else if (fileName.length() > 0){
            return 0;
        } else {
            try {
                throw new FileNameException("File name is null or empty.");
            } catch (FileNameException ex){
                ex.printStackTrace();
                return -1;
            }
        }
    }
}