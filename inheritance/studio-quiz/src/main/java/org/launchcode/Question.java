package org.launchcode;

public class Question {
    private final int questionNum;
    private static int nextQuestionNum = 1;
    private final String correctAnswer;
    private String correctAnswer2;

    public Question(String correctAnswer){
        this.questionNum = nextQuestionNum;
        nextQuestionNum ++;
        this.correctAnswer = correctAnswer;
    }

    public Question(String correctAnswer, String correctAnswer2){
        questionNum = nextQuestionNum;
        nextQuestionNum ++;
        this.correctAnswer = correctAnswer;
        this.correctAnswer2 = correctAnswer2;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public String getCorrectAnswer(){
        return correctAnswer;
    }

    public String getCorrectAnswer2(){
        return correctAnswer2;
    }

    public boolean checkCorrect(){
        return false;
    }
}
