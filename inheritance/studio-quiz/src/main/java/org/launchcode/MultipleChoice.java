package org.launchcode;

import java.util.Scanner;

public class MultipleChoice extends Question{
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private boolean isCorrect;

    Scanner input = new Scanner(System.in);

    public MultipleChoice(String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer){
        super(correctAnswer, question);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    @Override
    public String toString(){
        return getQuestionNum() + ") " + getQuestion() + "\nType the CORRECT answer:\n" + answer1 + "\n" + answer2  + "\n" + answer3  + "\n" + answer4 + "\n";
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
