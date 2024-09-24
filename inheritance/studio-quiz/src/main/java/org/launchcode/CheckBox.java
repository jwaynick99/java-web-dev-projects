package org.launchcode;

import java.util.Scanner;

public class CheckBox extends Question{
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer2;
    private boolean isCorrect;

    Scanner input = new Scanner(System.in);

    public CheckBox(String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String correctAnswer2){
        super(correctAnswer);
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer2 = correctAnswer2;
    }

    @Override
    public String toString(){
        return getQuestionNum() + ") " + question + "\nType the CORRECT answer(s) one at a time.:\n" + answer1 + "\n" + answer2  + "\n" + answer3  + "\n" + answer4 + "\n";
    }

    public boolean checkCorrect(){
        System.out.println(this.toString());
        String userInput = input.next();
        if (userInput.equals(getCorrectAnswer())){
            isCorrect = true;
        }
        return isCorrect;
    }
}
