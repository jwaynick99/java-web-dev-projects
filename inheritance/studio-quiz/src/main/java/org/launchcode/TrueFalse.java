package org.launchcode;

import java.util.Scanner;

public class TrueFalse extends Question{
    private String answer1;
    private String answer2;
    private boolean isCorrect;

    Scanner input = new Scanner(System.in);

    public TrueFalse(String question, String answer1, String answer2, String correctAnswer){
        super(correctAnswer, question);
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    @Override
    public String toString(){
        return getQuestionNum() + ") " + getQuestion() + "True or False:" + "\n" + answer1 + "\nor\n" + answer2 + "\n";
    }

    public boolean checkCorrect(){
        System.out.println(this.toString());
        String userInput = input.nextLine();
        if (userInput.equals(getCorrectAnswer())){
            isCorrect = true;
        }
        return isCorrect;
    }


}
