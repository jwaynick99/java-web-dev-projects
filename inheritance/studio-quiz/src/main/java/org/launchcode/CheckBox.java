package org.launchcode;

import java.util.Scanner;

public class CheckBox extends Question{
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private boolean isCorrect;

    Scanner input = new Scanner(System.in);

    public CheckBox(String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String correctAnswer2){
        super(correctAnswer, correctAnswer2,question);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    @Override
    public String toString(){
        return getQuestionNum() + ") " + getQuestion() + "\nType the CORRECT answer(s) one at a time.:\n" + answer1 + "\n" + answer2  + "\n" + answer3  + "\n" + answer4 + "\n";
    }

    @Override

    public boolean checkCorrect(){
        System.out.println(this.toString());
        String userInput = input.nextLine();
        String userInput2 = input.nextLine();
        System.out.println(getCorrectAnswer() + " " + getCorrectAnswer2());
        if (userInput.equals(getCorrectAnswer()) && userInput2.equals(getCorrectAnswer2()) || userInput2.equals(getCorrectAnswer()) && userInput.equals(getCorrectAnswer2())){
            isCorrect = true;
        }
        return isCorrect;
    }
}
