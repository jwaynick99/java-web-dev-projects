package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Scanner input = new Scanner(System.in);
    ArrayList<Question> quiz = new ArrayList<>();

    int correct = 0;

    public void addQuestion(Question question){
        quiz.add(question);
    }

    public void runQuiz(){
        System.out.println("Welcome to our quiz! This quiz has " + quiz.size() + " questions. Let's begin. \n" );
        for (Question question : quiz){
            if (question.checkCorrect()){
                correct++;
            }
        }
    }

    public void gradeQuiz(){

        System.out.println("Correct: " + correct + "/" + quiz.size());
    }
}
