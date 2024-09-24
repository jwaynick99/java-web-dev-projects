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
            /*String answer;
            String answer2;
            if (question.getClass() == CheckBox.class){
                System.out.println(question.toString());
                answer = input.next();
                answer2 = input.next();
                if (question.getCorrectAnswer().equals(answer) && question.getCorrectAnswer2().equals(answer2) || question.getCorrectAnswer().equals(answer2) && question.getCorrectAnswer2().equals(answer)){
                    correct++;
                }
            } else {
                System.out.println(question.toString());
                System.out.println(question.getCorrectAnswer());
                answer = input.next();
                if (question.getCorrectAnswer().equals(answer)) {
                    correct++;
                }
            }*/
        }
    }

    public void gradeQuiz(){

        System.out.println("Correct: " + correct + "/" + quiz.size());
    }
}
