package org.launchcode;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        String grade;
        if (this.numberOfCredits <= 29){
            grade = "Freshman";
        } else if (this.numberOfCredits <= 59) {
            grade = "Sophmore";
        } else if (this.numberOfCredits <= 89) {
            grade = "Junior";
        } else {
            grade = "Senior";
        }
        return grade;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double totalScore = this.gpa * this.numberOfCredits;
        totalScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    @Override
    public String toString(){
        String report = String.format("%s (Grade: %s, Credits: %d GPA: %.2f)", this.name, this.getGradeLevel(), this.numberOfCredits, this.gpa);
        return report;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared){
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()){
            return false;
        }
        Student student = (Student) toBeCompared;
        return getStudentId() == student.getStudentId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentId());
    }

    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}